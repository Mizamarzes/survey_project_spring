package com.survey.survey.auth.application.services;

import java.util.List;
import java.util.Optional;

import com.survey.survey.auth.domain.models.Role;

public interface RoleService {

    Optional<Role> findById(Long id);

    List<Role> getAll();
    
    Role save(Role role);
}
