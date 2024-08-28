package com.survey.survey.subresponse_options.domain.entities;

import com.survey.survey.at.domain.entities.CreatedUpdatedTime;
import com.survey.survey.response_options.domain.entities.ResponseOptions;

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
@Table(name = "subresponse_options")
public class SubResponseOptions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "INTEGER", nullable = false)
    private int subresponse_number;

    @Embedded
    CreatedUpdatedTime createdUpdatedTime;
    
    @ManyToOne
    @JoinColumn(name = "responseoptions_id", nullable = false)
    private ResponseOptions responseOptions;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String component_html;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String subresponse_text;
 
}
