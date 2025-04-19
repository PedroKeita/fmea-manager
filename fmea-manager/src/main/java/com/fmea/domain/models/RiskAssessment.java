package com.fmea.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RiskAssessment {

    @Id
    private Long id;

    private int Severity;
    private int Occurrence;
    private int Detection;



    public int calculateRPN() {
        return Severity * Occurrence * Detection;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
