package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.model.Tutorial;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TutorialService {
    private TutorialRepository tutorialRepository;

    @Autowired
    public TutorialService(TutorialRepository tutorialRepository) {
        this.tutorialRepository = tutorialRepository;
    }

    public Tutorial getTutorial(Long id) {
        if(!tutorialRepository.existsById(id)) {
            throw new RuntimeException("tutorial not exist");
        }
        return tutorialRepository.findById(id).get();
    }
}
