package com.befit.befit.model;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "goals")
@Entity
public class Goals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Nullable
    private int actualWeight;

    @Column
    @Nullable
    private int plannedDailyKcal;

    @Column
    @Nullable
    private int plannedDailyProteins;
    
    @Column
    @Nullable
    private int plannedDailyFats;

    @Column
    @Nullable
    private int plannedDailyCarbs;

    @Column
    @Nullable
    private int plannedAccomplishDate;


}
