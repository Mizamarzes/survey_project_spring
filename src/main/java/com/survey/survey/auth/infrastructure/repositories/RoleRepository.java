package com.survey.survey.auth.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.survey.survey.auth.domain.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
