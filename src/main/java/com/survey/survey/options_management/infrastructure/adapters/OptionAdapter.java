package com.survey.survey.options_management.infrastructure.adapters;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.survey.options_management.application.services.OptionService;
import com.survey.survey.options_management.domain.models.Option;
import com.survey.survey.options_management.infrastructure.repositories.OptionRepository;

@Service
public class OptionAdapter implements OptionService {

    @Autowired
    private OptionRepository optionRepository;

    @Override
    public Optional<Option> findById(Long id) {
        return optionRepository.findById(id);
    }

    @Override
    public List<Option> getAll() {
        return optionRepository.findAll();
    }

    @Override
    public Option save(Option option) {
        return optionRepository.save(option);
    }

    @Override
    public Option update(Long id, Option option) {
        return optionRepository.findById(id)
            .map(existingOption -> {
                existingOption.setOptiontext(option.getOptiontext());
                return optionRepository.save(existingOption);
            }) 
            .orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        optionRepository.deleteById(id);;
    }

}
