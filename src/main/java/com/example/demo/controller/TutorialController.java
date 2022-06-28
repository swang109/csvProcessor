package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.model.Tutorial;
import com.example.demo.service.CustomerService;
import com.example.demo.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutorialController {
    private TutorialService tutorialService;

    @Autowired
    public TutorialController(TutorialService tutorialService) {
        this.tutorialService = tutorialService;
    }

    @GetMapping("/tutorial/{id}")
    public Tutorial getTutorial(@PathVariable Long id) {
        return tutorialService.getTutorial(id);
    }
}
