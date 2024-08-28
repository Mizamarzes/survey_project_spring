package com.survey.survey.surveys.domain.entities;

import com.survey.survey.at.domain.entities.CreatedUpdatedTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "surveys")
public class Surveys {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    CreatedUpdatedTime createdUpdatedTime;
    
    @Column (columnDefinition = "VARCHAR(255)", nullable = false)
    private String Description;

    @Column (columnDefinition = "VARCHAR(255)", nullable = false)
    private String name;
}
