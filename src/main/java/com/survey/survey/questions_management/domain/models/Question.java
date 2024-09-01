package com.survey.survey.questions_management.domain.models;

import java.util.List;

import com.survey.survey.chapters_management.domain.models.Chapter;
import com.survey.survey.helpers.CreatedUpdatedTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne(
        targetEntity = QuestionCategory.class, 
        fetch = FetchType.LAZY, 
        cascade = CascadeType.ALL
    )
    @JoinColumn(name = "question_category_id")
    private QuestionCategory questionCategory;

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
