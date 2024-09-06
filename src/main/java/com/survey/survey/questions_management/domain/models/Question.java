package com.survey.survey.questions_management.domain.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.survey.survey.chapters_management.domain.models.Chapter;
import com.survey.survey.helpers.CreatedUpdatedTime;
import com.survey.survey.options_management.domain.models.Option;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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

    @JsonIgnore
    @ManyToMany
    @JoinTable(
        name = "question_chapters",
        joinColumns = @JoinColumn(name = "question_id"),
        inverseJoinColumns = @JoinColumn(name = "chapter_id")
    )
    private List<Chapter> chapters;

    @Embedded
    private CreatedUpdatedTime createdUpdatedTime;

    @Column(columnDefinition = "varchar(20)", nullable = false)
    private String responseType;

    @Column(columnDefinition = "text")
    private String questionText;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true) 
    private List<Option> options;

}
