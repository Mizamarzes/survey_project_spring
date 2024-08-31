package com.survey.survey.auth.application.services;

import java.util.List;
import java.util.Optional;

import com.survey.survey.auth.domain.models.User;

public interface UserService { 
    
    Optional<User> findById(Long id);
    
    List<User> findAll();

    User save(User user);
}
