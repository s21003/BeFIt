package com.befit.befit.model;

import java.time.LocalDateTime;

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
public class Trening {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    private Long treningSchemaId;

    @Column
    @NotNull
    private Long userId;

    @Column
    @NotNull
    private LocalDateTime date;

    @Column
    @Enumerated(EnumType.STRING)
    @NotNull
    private TreningCategory category;

}
