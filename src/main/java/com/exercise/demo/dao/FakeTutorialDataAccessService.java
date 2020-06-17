package com.exercise.demo.dao;

import com.exercise.demo.model.Tutorial;
import org.springframework.stereotype.Repository;

import java.time.Period;
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
    public int updateTutorialById(int id, Tutorial updateTutorial) {
        return selectTutorialById(id).map(tutorial -> {
            int idxOfTutorialToUpdate = DB.indexOf(tutorial);
            if(idxOfTutorialToUpdate >=0){
                DB.set(idxOfTutorialToUpdate,new Tutorial(updateTutorial.getId(),updateTutorial.getTitle(),updateTutorial.getDescription(),updateTutorial.getStatus()));
                return 1;
            }
            return 0;
        }).orElse(0);
    }

    @Override
    public int deleteTutorialById(int id) {
        Optional<Tutorial> tutorialMaybe = selectTutorialById(id);
        if(tutorialMaybe.isPresent()){
            DB.remove(tutorialMaybe.get());
            return 1;
        }
        return 0;
    }

    @Override
    public int deleteAllTutorial() {
        DB.clear();
        return 1;
    }
}
