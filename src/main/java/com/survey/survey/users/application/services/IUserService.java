package com.survey.survey.users.application.services;

import java.util.List;
import java.util.Optional;

import com.survey.survey.users.domain.entities.User;

public interface IUserService {
    Optional<User> findById(Long id);
    List<User> getAll();
    User save(User user);
}
