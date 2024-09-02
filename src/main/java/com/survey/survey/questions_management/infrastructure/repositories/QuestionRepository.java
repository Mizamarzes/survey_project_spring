package com.survey.survey.questions_management.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.survey.survey.questions_management.domain.models.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
