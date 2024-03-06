package edu.ithaca.dturnbull.util;

import java.util.ArrayList;
import java.util.List;

public class WorkoutOrganizer {
    
    private List<String> allExercises; // create the list

    public WorkoutOrganizer() {
        allExercises = new ArrayList<>(); // initialize the list
    }

    /**
     * Creates a list of all of the exercises by their names
     * @param name the difficulty level
     * @return 'allExercises' the full list of exercises
     */
    public List<String> getAllExercises(String name) {
        return allExercises;
    }

    /**
     * Creates a list of all of the exercises by their names
     * @param exercises the difficulty level
     * @return the full list of exercises
     */
    public List<String> displayWorkout(String name) {
        // didnt get this far for the project yet
        return null;
    }


}
