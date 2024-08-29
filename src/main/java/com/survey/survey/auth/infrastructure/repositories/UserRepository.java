package com.survey.survey.auth.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.survey.survey.auth.domain.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
