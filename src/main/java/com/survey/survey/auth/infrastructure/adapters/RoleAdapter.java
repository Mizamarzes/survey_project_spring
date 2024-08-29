package com.survey.survey.auth.infrastructure.adapters;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.survey.auth.application.services.IRoleService;
import com.survey.survey.auth.domain.entities.Role;
import com.survey.survey.auth.infrastructure.repositories.RoleRepository;

@Service
public class RoleAdapter implements IRoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Optional<Role> findById(Long id) {
        return roleRepository.findById(id);
    }

    @Override
    public List<Role> getAll(){
        return roleRepository.findAll();
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }
}
