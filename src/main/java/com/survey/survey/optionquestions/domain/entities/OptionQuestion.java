package com.survey.survey.optionquestions.domain.entities;

import com.survey.survey.at.domain.entities.CreatedUpdatedTime;
import com.survey.survey.options.domain.entities.Options;
import com.survey.survey.questions.domain.entities.Question;
import com.survey.survey.subquestions.domain.entities.SubQuestion;

import jakarta.persistence.CascadeType;
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
@Table(name = "option_questions")
public class OptionQuestion {

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

    @ManyToOne(
        targetEntity = SubQuestion.class, 
        fetch = FetchType.LAZY, 
        cascade = CascadeType.ALL
    )
    @JoinColumn(name = "subquestion_id")
    private SubQuestion subQuestion;

    @ManyToOne(
        targetEntity = Options.class, 
        fetch = FetchType.LAZY, 
        cascade = CascadeType.ALL
    )
    @JoinColumn(name = "option_id")
    private Options option_id;

    
}
