package com.survey.survey.questions_management.application.services;

import com.survey.survey.questions_management.domain.models.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionService {

    Optional<Question> findById(Long id);

    List<Question> getAll();

    Question save(Question question);

    Question update(Long id, Question question);

    void deleteById(long id);
}
