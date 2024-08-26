package com.survey.survey.users.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.survey.survey.users.domain.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
