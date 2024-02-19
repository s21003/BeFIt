package com.befit.befit.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Table(name = "products")
@Entity
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private double kcal;

    @Column
    @NotNull
    private double protein;

    @Column
    @NotNull
    private double fat;

    @Column
    @NotNull
    private double carbs;

    @Column
    @NotNull
    private double weight;
    
}
