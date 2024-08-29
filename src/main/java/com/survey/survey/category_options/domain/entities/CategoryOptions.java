package com.survey.survey.category_options.domain.entities;

import com.survey.survey.at.domain.entities.CreatedUpdatedTime;
import com.survey.survey.catalog.domain.entities.Catalog;

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
@Table(name = "categoryOptions")
public class CategoryOptions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "catalogoptionsId")
    private Catalog catalog;

    @ManyToOne
    @JoinColumn(name = "categoriesoptionsId")
    private Options option;

    @Embedded
    CreatedUpdatedTime createdUpdatedTime;
}