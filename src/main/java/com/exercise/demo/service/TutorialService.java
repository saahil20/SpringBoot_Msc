package com.exercise.demo.service;

import com.exercise.demo.dao.TutorialDao;
import com.exercise.demo.model.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TutorialService {

    private final TutorialDao tutorialDao;

    @Autowired
    public TutorialService(@Qualifier("fakeDao") TutorialDao tutorialDao) {
        this.tutorialDao = tutorialDao;
    }

    public int addTutorial(Tutorial tutorial){
        return tutorialDao.insertTutorial(tutorial);
    }

    public List<Tutorial> getAllTutorial(){
        return tutorialDao.selectAllTutorial();
    }

    public Optional<Tutorial> selectTutorialById(int id){
        return tutorialDao.selectTutorialById(id);
    }

    public int deleteTutorialById(int id){
        return tutorialDao.deleteTutorialById(id);
    }

    public int updateTutorialById(int id, Tutorial tutorial){
        return tutorialDao.updateTutorialById(id,tutorial);
    }

}
