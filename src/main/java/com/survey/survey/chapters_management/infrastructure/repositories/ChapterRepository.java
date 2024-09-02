package com.survey.survey.chapters_management.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.survey.survey.chapters_management.domain.models.Chapter;

public interface ChapterRepository extends JpaRepository<Chapter, Long>{

}
