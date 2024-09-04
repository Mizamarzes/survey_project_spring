package com.survey.survey.survey_management.infrastructure.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.survey.survey.survey_management.application.services.SurveyService;
import com.survey.survey.survey_management.domain.models.Survey;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/survey")
@RequiredArgsConstructor
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @GetMapping
    public ResponseEntity<Page<Survey>> listSurveys( 
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size){

        System.out.println("Page: " + page + ", Size: " + size);
        return ResponseEntity.ok().body(surveyService.findAll(page, size));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Survey> showSurvey(@PathVariable Long id) {
        return surveyService.findById(id)
                .map(survey -> new ResponseEntity<>(survey, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Survey> createSurvey(@RequestBody Survey survey){
        Survey newSurvey = surveyService.save(survey);
        return new ResponseEntity<>(newSurvey, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Survey> updateSurvey(@PathVariable Long id, @RequestBody Survey survey){
        Survey updateSurvey = surveyService.update(id, survey);
        if(updateSurvey != null){
            return new ResponseEntity<>(updateSurvey, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSurvey(@PathVariable Long id){
        if (surveyService.findById(id).isPresent()) {
            surveyService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
