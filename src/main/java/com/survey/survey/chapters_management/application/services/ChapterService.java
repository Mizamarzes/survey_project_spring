package com.survey.survey.chapters_management.application.services;

import java.util.List;
import java.util.Optional;

import com.survey.survey.chapters_management.domain.models.Chapter;

public interface ChapterService {

    Optional<Chapter> findById(Long id);

    List<Chapter> getAll();

    Chapter save(Chapter chapter);

    Chapter update(Long id, Chapter chapter);

    void deleteById(Long id);
}
