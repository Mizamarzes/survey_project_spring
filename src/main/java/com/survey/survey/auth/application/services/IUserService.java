package com.survey.survey.auth.application.services;

import java.util.List;
import java.util.Optional;

import com.survey.survey.auth.domain.entities.User;

public interface IUserService {
    Optional<User> findById(Long id);
    List<User> findAll();
    User save(User user);
}
