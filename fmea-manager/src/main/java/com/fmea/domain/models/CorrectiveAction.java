package com.fmea.domain.models;

import com.fmea.domain.enums.ActionStatus;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class CorrectiveAction {
    //Aqui vai ser a ação, depois de analisar o projeto FMEA e suas falhas de modo, vai indicar a melhor ação para resolver
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ActionDescription;
    private String Responsible;
    private Date DateImplementation;


    @Enumerated(EnumType.STRING)
    private ActionStatus ActionStatus;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
