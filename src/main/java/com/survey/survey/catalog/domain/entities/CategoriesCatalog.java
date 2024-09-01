package com.survey.survey.catalog.domain.entities;

import java.util.List;

import com.survey.survey.helpers.CreatedUpdatedTime;
import com.survey.survey.survey_management.domain.models.Survey;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categories_catalog")
public class CategoriesCatalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    CreatedUpdatedTime createdUpdatedTime;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String name;

    @ManyToMany(mappedBy = "categoriesCatalogs")
    private List<Survey> surveys;
}
