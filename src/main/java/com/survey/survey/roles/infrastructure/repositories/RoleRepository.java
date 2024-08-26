package com.survey.survey.roles.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.survey.survey.roles.domain.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
