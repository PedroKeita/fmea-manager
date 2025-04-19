package com.fmea.interfaces.controller;

import com.fmea.domain.models.Fmea;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/fmea")
public class fmeaController {
    @RequestMapping(path = "/edson")
    public Fmea obterFmea(){
        return new Fmea(28,"Pedro","232423-324234-234-2");
    }
}
