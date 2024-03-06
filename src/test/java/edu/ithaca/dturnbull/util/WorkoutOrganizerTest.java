package edu.ithaca.dturnbull.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class WorkoutOrganizerTest {

    private WorkoutOrganizer workoutOrganizer;
    
    @Test
    public void getAllExercisesTest() {
        workoutOrganizer = new WorkoutOrganizer();
        List<String> allExercises = workoutOrganizer.getAllExercises(null);
        assertNotNull(allExercises);
        Trainer.addExercise("Push-ups", null, null, false, null, false, 0, 0);
        Trainer.addExercise("Squats", null, null, false, null, false, 0, 0);
        Trainer.addExercise("Plank", null, null, false, null, false, 0, 0);
        assertEquals(3, allExercises.size());
        assertTrue(allExercises.contains("Push-ups"));
        assertTrue(allExercises.contains("Squats"));
        assertTrue(allExercises.contains("Plank"));
    }
    
}
