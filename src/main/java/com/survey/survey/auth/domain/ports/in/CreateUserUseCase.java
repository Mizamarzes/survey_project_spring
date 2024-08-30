package com.survey.survey.auth.domain.ports.in;

import org.springframework.scheduling.config.Task;

import com.survey.survey.auth.domain.models.User;

public interface CreateUserUseCase {
    User createTask(Task task);
}
