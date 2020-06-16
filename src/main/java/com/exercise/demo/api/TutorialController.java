package com.exercise.demo.api;

import com.exercise.demo.model.Tutorial;
import com.exercise.demo.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/tutorials")
@RestController
public class TutorialController {

    private final TutorialService tutorialService;

    @Autowired
    public TutorialController(TutorialService tutorialService) {
        this.tutorialService = tutorialService;
    }

    @PostMapping
    public void addTutorial(@RequestBody Tutorial tutorial){
        tutorialService.addTutorial(tutorial);
    }
}
