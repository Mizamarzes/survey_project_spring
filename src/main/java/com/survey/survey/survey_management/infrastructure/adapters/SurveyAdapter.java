package com.survey.survey.survey_management.infrastructure.adapters;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.survey.survey.survey_management.application.services.SurveyService;
import com.survey.survey.survey_management.domain.models.Survey;
import com.survey.survey.survey_management.infrastructure.repositories.SurveyRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Transactional(rollbackOn = Exception.class)
@RequiredArgsConstructor
public class SurveyAdapter implements SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    @Override
    public Optional<Survey> findById(Long id) {
        return surveyRepository.findById(id);
    }

    @Transactional
    @Override
    public Page<Survey> findAll(Pageable pageable) {
        return (Page<Survey>) surveyRepository.findAll(pageable);
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
