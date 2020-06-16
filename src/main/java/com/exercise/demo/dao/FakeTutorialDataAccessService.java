package com.exercise.demo.dao;

import com.exercise.demo.model.Tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakeTutorialDataAccessService implements TutorialDao {

    private static List<Tutorial> DB = new ArrayList<>();

    @Override
    public int insertTutorial(UUID id, Tutorial tutorial) {
        DB.add(new Tutorial(id,tutorial.getTitle(),tutorial.getDescription(),tutorial.getStatus()));
        return 1;
    }
}
