package com.fmea.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class FailureMode {

    @Id
    private Long id;


    private String FailureDescription;
    private String FailureCauses;
    private String FailureEffect;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
