package com.survey.survey.auth.application.services;

import java.util.List;
import java.util.Optional;

import com.survey.survey.auth.domain.models.User;

public interface UserServicePort {
    Optional<User> findById(Long id);
    Optional<User> findByUsername(String username);
    List<User> findAll();
    User save(User user);
    User update(Long id, User user);
    void deleteById(Long id);
}
