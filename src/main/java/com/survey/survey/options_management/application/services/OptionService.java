package com.survey.survey.options_management.application.services;

import java.util.List;
import java.util.Optional;

import com.survey.survey.options_management.domain.models.Option;

public interface OptionService {

    Optional<Option> findById(Long id);

    List<Option> getAll();

    Option save(Option option);

    Option update(Long id, Option option);

    void deleteById(Long id);

}
