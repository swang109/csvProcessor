package com.example.demo.service;

import com.example.demo.model.Tutorial;
import com.example.demo.repository.TutorialRepository;
import com.example.demo.utils.CSVUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

@Service
public class CSVService {
    @Autowired
    TutorialRepository tutorialRepository;
    public void processCSV(FileInputStream file) {
            List<Tutorial> tutorials = CSVUtil.csvToTutorials(file);
            tutorialRepository.saveAll(tutorials);
    }
}
