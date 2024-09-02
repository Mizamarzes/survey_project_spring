package com.survey.survey.questions_management.infrastructure.adapters;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.survey.questions_management.application.services.QuestionService;
import com.survey.survey.questions_management.domain.models.Question;
import com.survey.survey.questions_management.infrastructure.repositories.QuestionRepository;

@Service
public class QuestionAdapter implements QuestionService{

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Optional<Question> findById(Long id) {
        return questionRepository.findById(id);
    }

    @Override
    public List<Question> getAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question save(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Question update(Long id, Question question) {
        return questionRepository.findById(id)
                .map(existingQuestion -> {
                    existingQuestion.setQuestionNumber(question.getQuestionNumber());
                    existingQuestion.setResponseType(question.getResponseType());
                    existingQuestion.setCommentQuestion(question.getCommentQuestion());
                    existingQuestion.setQuestionNumber(question.getQuestionNumber());
                    return questionRepository.save(existingQuestion);
                })
                .orElse(null);
    }

    @Override
    public void deleteById(long id) {
        questionRepository.deleteById(id);
    }

}
