package com.survey.survey.options.domain.entities;

import java.util.HashSet;
import java.util.Set;

import com.survey.survey.at.domain.entities.CreatedUpdatedTime;
import com.survey.survey.category_options.domain.entities.CategoryOptions;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "options")
public class Options {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private CreatedUpdatedTime createdUpdatedTime;

    @Column(columnDefinition = "VARCHAR(10)", nullable = false)
    private String optiontext;

    @OneToMany(mappedBy = "options", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CategoryOptions> categoryOptions = new HashSet<>();
}
