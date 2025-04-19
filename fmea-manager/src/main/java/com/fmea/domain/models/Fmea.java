package com.fmea.domain.models;

import jakarta.persistence.*;

@Entity
public class Fmea {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String item;


    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "failure_mode_id")
    private FailureMode failuremode;

    @OneToOne
    private RiskAssessment riskassessment;

    @OneToOne
    private CorrectiveAction correctiveaction;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
