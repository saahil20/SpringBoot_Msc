package com.exercise.demo.service;

import com.exercise.demo.dao.TutorialDao;
import com.exercise.demo.model.Tutorial;

public class TutorialService {

    private final TutorialDao tutorialDao;

    public TutorialService(TutorialDao tutorialDao) {
        this.tutorialDao = tutorialDao;
    }

    public int addTutorial(Tutorial tutorial){
        return tutorialDao.insertTutorial(tutorial);
    }


}
