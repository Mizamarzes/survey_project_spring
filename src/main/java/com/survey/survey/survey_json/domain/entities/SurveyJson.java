package com.survey.survey.survey_json.domain.entities;

import com.survey.survey.at.domain.entities.CreatedUpdatedTime;
import com.survey.survey.surveys.domain.entities.Surveys;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "survey_json")
public class SurveyJson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    CreatedUpdatedTime createdUpdatedTime;

    @ManyToOne
    @JoinColumn(name = "survey_id")
    private Surveys survey;

    @Column(columnDefinition = "JSONB", nullable = false)
    private String payload = "";

}
