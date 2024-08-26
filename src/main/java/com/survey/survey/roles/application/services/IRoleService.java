package com.survey.survey.roles.application.services;

import java.util.List;
import java.util.Optional;

import com.survey.survey.roles.domain.entities.Role;

public interface IRoleService {
    Optional<Role> findById(Long id);
    List<Role> getAll();
    Role save(Role role);
}
