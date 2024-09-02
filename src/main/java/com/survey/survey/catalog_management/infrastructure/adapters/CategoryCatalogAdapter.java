package com.survey.survey.catalog_management.infrastructure.adapters;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.survey.catalog_management.application.services.CategoryCatalogService;
import com.survey.survey.catalog_management.domain.models.CategoryCatalog;
import com.survey.survey.catalog_management.infrastructure.repositories.CategoryCatalogRepository;

@Service
public class CategoryCatalogAdapter implements CategoryCatalogService {

    @Autowired
    private CategoryCatalogRepository categoryCatalogRepository;

    @Override
    public Optional<CategoryCatalog> findById(long id) {
        return categoryCatalogRepository.findById(id);
    }

    @Override
    public List<CategoryCatalog> getAll() {
        return categoryCatalogRepository.findAll();
    }

    @Override
    public CategoryCatalog save(CategoryCatalog categoryCatalog) {
        return categoryCatalogRepository.save(categoryCatalog);
    }

    @Override
    public CategoryCatalog update(Long id, CategoryCatalog categoryCatalog) {
        return categoryCatalogRepository.findById(id)
                .map(existingCategoryCatalog -> {
                    existingCategoryCatalog.setName(categoryCatalog.getName());
                    existingCategoryCatalog.setSurveys(categoryCatalog.getSurveys());
                    return categoryCatalogRepository.save(existingCategoryCatalog);
                })
                .orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        categoryCatalogRepository.deleteById(id);
    }

    
}
