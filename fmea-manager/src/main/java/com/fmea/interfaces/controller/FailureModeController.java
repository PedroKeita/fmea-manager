package com.fmea.interfaces.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FailureModeController {

    @GetMapping(path = "/eae")
    public String teste() {
        return "Testando";
    }
}
