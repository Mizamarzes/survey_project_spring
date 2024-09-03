package com.survey.survey.survey_management.application.services;

import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;


import com.survey.survey.survey_management.domain.models.Survey;

public interface SurveyService {

    Optional<Survey> findById(Long id);

    Page<Survey> findAll(Pageable pageable);

    Survey save(Survey survey);

    Survey update(Long id, Survey survey);

    void deleteById(Long id);
}
