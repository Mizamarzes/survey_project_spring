package com.survey.survey.questions_management.domain.models;

import com.survey.survey.category_options.domain.entities.CategoryOptions;
import com.survey.survey.helpers.CreatedUpdatedTime;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "question_categories")
public class QuestionCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    CreatedUpdatedTime createdUpdatedTime;

    @ManyToOne(targetEntity = CategoryOptions.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "category_option_id")
    private CategoryOptions categoryOption; 

}
