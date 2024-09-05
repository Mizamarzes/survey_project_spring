package com.survey.survey.chapters_management.domain.models;

import java.util.List;

import com.survey.survey.helpers.CreatedUpdatedTime;
import com.survey.survey.questions_management.domain.models.Question;
import com.survey.survey.survey_management.domain.models.Survey;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "chapters")
public class Chapter {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private CreatedUpdatedTime createdUpdatedTime;

    @ManyToOne
    @JoinColumn(name = "survey_id")
    private Survey survey;

    @ManyToMany(mappedBy = "chapters")
    private List<Question> questions;

    @Column(columnDefinition = "varchar(50)", nullable = false)
    private String chapterTitle;

}
