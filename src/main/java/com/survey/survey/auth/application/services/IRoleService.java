package com.survey.survey.auth.application.services;

import java.util.List;
import java.util.Optional;

import com.survey.survey.auth.domain.models.Role;

public interface IRoleService {
    Optional<Role> findById(Long id);
    Optional<Role> findByUsername(String username);
    List<Role> getAll();
    Role save(Role role);
}
