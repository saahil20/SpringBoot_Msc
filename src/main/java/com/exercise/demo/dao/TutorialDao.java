package com.exercise.demo.dao;

import com.exercise.demo.model.Tutorial;

import java.util.List;
import java.util.UUID;

public interface TutorialDao {
    int insertTutorial(Tutorial tutorial);

//    default int insertTutorial(Tutorial tutorial){
//        UUID id= UUID.randomUUID();
//        return insertTutorial(id,tutorial);
//    }

    List<Tutorial> selectAllTutorial();
}
