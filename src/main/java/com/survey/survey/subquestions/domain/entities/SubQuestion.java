package com.survey.survey.subquestions.domain.entities;

import com.survey.survey.at.domain.entities.CreatedUpdatedTime;
import com.survey.survey.questions.domain.entities.Question;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@Table(name = "sub_questions")
public class SubQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    CreatedUpdatedTime createdUpdatedTime;

    @ManyToOne(
        targetEntity = Question.class,
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL    
    )
    @JoinColumn(name = "question_id")
    private Question question;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String subquestiontext;

}
