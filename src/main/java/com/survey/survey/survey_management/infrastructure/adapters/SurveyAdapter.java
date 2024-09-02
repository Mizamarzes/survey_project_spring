package com.survey.survey.survey_management.infrastructure.adapters;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.survey.survey_management.application.services.SurveyService;
import com.survey.survey.survey_management.domain.models.Survey;
import com.survey.survey.survey_management.infrastructure.repositories.SurveyRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SurveyAdapter implements SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    @Override
    public Optional<Survey> findById(Long id) {
        return surveyRepository.findById(id);
    }

    @Override
    public List<Survey> findAll() {
        return surveyRepository.findAll();
    }

    @Override
    public Survey save(Survey survey) {
        return surveyRepository.save(survey);
    }

    @Override
    public Survey update(Long id, Survey survey) {
        return surveyRepository.findById(id)
                .map(existingSurvey -> {
                    existingSurvey.setName(survey.getName());
                    existingSurvey.setDescription(survey.getDescription());
                    return surveyRepository.save(existingSurvey);
                })
                .orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        surveyRepository.deleteById(id);
    }

}
