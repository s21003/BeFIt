package com.befit.befit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "userTrainer")
@Entity
public class UserTrainer {

    @Id
    private Long userId;

    @Id
    private Long trainerId;
}
