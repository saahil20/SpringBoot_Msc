package com.exercise.demo.dao;

import com.exercise.demo.model.Tutorial;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TutorialDao {
    int insertTutorial(Tutorial tutorial);


    List<Tutorial> selectAllTutorial();

    Optional<Tutorial> selectTutorialById(int id);

    int updateTutorialById(int id, Tutorial tutorial);

    int deleteTutorialById(int id);
}
