package com.survey.survey.survey_management.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.survey.survey.survey_management.domain.models.Survey;

public interface SurveyRepository extends JpaRepository<Survey, Long> {
    
}
