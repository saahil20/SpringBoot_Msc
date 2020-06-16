package com.exercise.demo.dao;

import com.exercise.demo.model.Tutorial;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakeTutorialDataAccessService implements TutorialDao {

    private static List<Tutorial> DB = new ArrayList<>();

    @Override
    public int insertTutorial(Tutorial tutorial) {
        DB.add(new Tutorial(tutorial.getId(),tutorial.getTitle(),tutorial.getDescription(),tutorial.getStatus()));
        return 1;
    }

    @Override
    public List<Tutorial> selectAllTutorial() {
        return DB;
    }

    @Override
    public Optional<Tutorial> selectTutorialById(int id) {
        return DB.stream().filter(tutorial -> tutorial.getId()==id).findFirst();
    }

    @Override
    public int UpdateTutorialById(int id, Tutorial tutorial) {
        return 0;
    }

    @Override
    public int DeleteTutorialById(int id) {
        return 0;
    }
}
