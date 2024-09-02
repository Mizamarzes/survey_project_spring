package com.survey.survey.catalog_management.application.services;

import java.util.List;
import java.util.Optional;

import com.survey.survey.catalog_management.domain.models.CategoryCatalog;

public interface CategoryCatalogService {

    Optional<CategoryCatalog> findById(long id);

    List<CategoryCatalog> getAll();

    CategoryCatalog save(CategoryCatalog categoryCatalog);

    CategoryCatalog update(Long id, CategoryCatalog categoryCatalog);

    void deleteById(Long id);

}
