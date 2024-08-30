package com.survey.survey.questions.domain.entities;

import java.util.List;

import com.survey.survey.at.domain.entities.CreatedUpdatedTime;
import com.survey.survey.chapter.domain.entities.Chapter;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
        name = "question_chapters",
        joinColumns = @JoinColumn(name = "question_id"),
        inverseJoinColumns = @JoinColumn(name = "chapter_id")
    )
    private List<Chapter> chapters;

    @Embedded
    private CreatedUpdatedTime createdUpdatedTime;

    @Column(columnDefinition = "varchar(10)", nullable = false)
    private String questionNumber;

    @Column(columnDefinition = "varchar(20)", nullable = false)
    private String responseType;

    @Column(columnDefinition = "text")
    private String commentQuestion;

    @Column(columnDefinition = "text")
    private String questionText;
}
