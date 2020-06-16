package com.exercise.demo.api;

import com.exercise.demo.model.Tutorial;
import com.exercise.demo.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<Tutorial> getAllTutorial(){
        return tutorialService.getAllTutorial();
    }
}
