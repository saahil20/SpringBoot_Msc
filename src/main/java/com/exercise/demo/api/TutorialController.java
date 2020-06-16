package com.exercise.demo.api;

import com.exercise.demo.model.Tutorial;
import com.exercise.demo.service.TutorialService;

public class TutorialController {

    private final TutorialService tutorialService;


    public TutorialController(TutorialService tutorialService) {
        this.tutorialService = tutorialService;
    }

    public void addTutorial(Tutorial tutorial){
        tutorialService.addTutorial(tutorial);
    }
}
