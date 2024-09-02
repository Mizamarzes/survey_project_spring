package com.survey.survey.catalog_management.infrastructure.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.survey.survey.catalog_management.application.services.CategoryCatalogService;
import com.survey.survey.catalog_management.domain.models.CategoryCatalog;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/catalog")
public class CategoryCatalogController {

    @Autowired
    private CategoryCatalogService categoryCatalogService;

    @GetMapping  
    public ResponseEntity<List<CategoryCatalog>> listCategoriesCatalog() {
        List<CategoryCatalog> categoryCatalogs = categoryCatalogService.getAll();
        return new ResponseEntity<>(categoryCatalogs, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryCatalog> showCategoryCatalog(@PathVariable Long id) {
        return categoryCatalogService.findById(id)
                .map(categoryCatalog -> new ResponseEntity<>(categoryCatalog, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<CategoryCatalog> createCategorieCatalog(@RequestBody CategoryCatalog categoryCatalog) {
        CategoryCatalog createdCategoryCatalog = categoryCatalogService.save(categoryCatalog);
        return new ResponseEntity<>(createdCategoryCatalog, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoryCatalog> updateCategorieCatalog(@PathVariable Long id, @RequestBody CategoryCatalog categoryCatalog) {
        CategoryCatalog updatedCategoryCatalog = categoryCatalogService.update(id, categoryCatalog);
        if (updatedCategoryCatalog != null) {
            return new ResponseEntity<>(updatedCategoryCatalog, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategorieCatalog(@PathVariable Long id) {
        if (categoryCatalogService.findById(id).isPresent()) {
            categoryCatalogService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
