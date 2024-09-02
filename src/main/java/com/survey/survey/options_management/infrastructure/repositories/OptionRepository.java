package com.survey.survey.options_management.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.survey.survey.options_management.domain.models.Option;

public interface OptionRepository extends JpaRepository<Option, Long> {

}
