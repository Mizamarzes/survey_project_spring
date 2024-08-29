package com.survey.survey.response_question.domain.entities;

import com.survey.survey.category_options.domain.entities.CategoryOptions;
import com.survey.survey.subresponse_options.domain.entities.SubResponseOptions;

import jakarta.persistence.Column;
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
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "response_questions")
public class ResponseQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "subresponses_id", nullable = false)
    private SubResponseOptions subResponseOptions;

    @ManyToOne
    @JoinColumn(name = "response_id", nullable = false)
    private CategoryOptions responseOptions;

    @Column(columnDefinition = "VARCHAR(80)", nullable = false)
    private String responsetext;
}
