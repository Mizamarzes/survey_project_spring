package com.survey.survey.catalog_management.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.survey.survey.catalog_management.domain.models.CategoryCatalog;

public interface CategoryCatalogRepository extends JpaRepository<CategoryCatalog, Long> {

}
