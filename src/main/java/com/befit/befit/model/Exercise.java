package com.befit.befit.model;

import java.net.URL;
import java.util.ArrayList;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Table
@Entity
public class Exercise {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    private String name;

    @Column
    @Enumerated(EnumType.STRING)
    @NotNull
    private BodyPart partia;

    @Column
    @Nullable
    private URL videoLink;

    @Column
    @Nullable
    private ArrayList <int[]> sets;

}
