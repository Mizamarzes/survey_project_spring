package com.survey.survey.surveys.domain.entities;


import com.survey.survey.at.domain.entities.CreatedUpdatedTime;
import com.survey.survey.chapter.domain.entities.Chapter;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.HashSet;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "surveys")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    CreatedUpdatedTime createdUpdatedTime;
    
    @Column (columnDefinition = "VARCHAR(255)", nullable = false)
    private String Description;

    @Column (columnDefinition = "VARCHAR(255)", nullable = false)
    private String name;

    @OneToMany(mappedBy = "survey", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Chapter> chapters = new HashSet<>();

    @ManyToMany
    @JoinTable(
        name = "survey_category",
        joinColumns = @JoinColumn(name = "survey_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id")
    )

    @Column(columnDefinition = "VARCHAR(20)", nullable = false)
    private String componenthtml;

    @Column(columnDefinition = "VARCHAR(20)", nullable = false)
    private String componentreact;


}
