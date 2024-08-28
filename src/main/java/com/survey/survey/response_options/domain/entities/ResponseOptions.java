package com.survey.survey.response_options.domain.entities;

import com.survey.survey.at.domain.entities.CreatedUpdatedTime;
import com.survey.survey.catalog.domain.entities.Catalog;
import com.survey.survey.questions.domain.entities.Question;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "response_options")
public class ResponseOptions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(10)", nullable = false)
    private String optionValue;

    @ManyToOne
    @JoinColumn(name = "categorycatalog_id", nullable = false)
    private Catalog catalog;

    @Embedded
    CreatedUpdatedTime createdUpdatedTime;

    @ManyToOne
    @JoinColumn(name = "parentResponseId", nullable = false)
    ResponseOptions responseOptions;

    @ManyToOne
    @JoinColumn(name = "questionId", nullable = false)
    private Question questions;

    @Column(columnDefinition = "VARCHAR(30)", nullable = false)
    private String typeComponentHtml;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String commentResponse;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String optionText;
}
