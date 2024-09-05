package com.survey.survey.chapters_management.infrastructure.adapters;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.survey.chapters_management.application.services.ChapterService;
import com.survey.survey.chapters_management.domain.models.Chapter;
import com.survey.survey.chapters_management.infrastructure.repositories.ChapterRepository;

@Service
public class ChapterAdapter implements ChapterService {

    @Autowired
    private ChapterRepository chapterRepository;

    @Override
    public Optional<Chapter> findById(Long id) {
        return chapterRepository.findById(id);
    }

    @Override
    public List<Chapter> getAll() {
        return chapterRepository.findAll();
    }

    @Override
    public Chapter save(Chapter chapter) {
        return chapterRepository.save(chapter);
    }

    @Override
    public Chapter update(Long id, Chapter chapter) {
        return chapterRepository.findById(id)
                .map(existingChapter -> {
                    existingChapter.setChapterTitle(chapter.getChapterTitle());
                    return chapterRepository.save(existingChapter);
                })
                .orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        chapterRepository.deleteById(id);
    }

}
