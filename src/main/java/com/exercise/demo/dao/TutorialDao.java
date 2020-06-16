package com.exercise.demo.dao;

import com.exercise.demo.model.Tutorial;

import java.util.UUID;

public interface TutorialDao {
    int insertTutorial(UUID id, Tutorial tutorial);

    default int addTutorial(Tutorial tutorial){
        UUID id= UUID.randomUUID();
        return insertTutorial(id,tutorial);
    }
}
