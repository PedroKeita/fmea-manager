package com.fmea.domain.models;

public class RiskAssessment {
    private int Severity;
    private int Occurrence;
    private int Detection;


    public int calculateRPN() {
        return Severity * Occurrence * Detection;
    }
}
