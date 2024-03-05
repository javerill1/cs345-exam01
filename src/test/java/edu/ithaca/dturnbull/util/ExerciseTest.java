package edu.ithaca.dturnbull.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExerciseTest {

    @Test
    public void exerciseTest() {
        // Create a 'squat' exercise
        Exercise exercise = new Exercise("Squat", "Lower body exercise", "Intermediate", true, "Legs", false, 3, 10);

        // Test all of its parameters
        assertEquals("Squat", exercise.getName());
        assertEquals("Lower body exercise", exercise.getDescription());
        assertEquals("Intermediate", exercise.getDifficultyLevel());
        assertTrue(exercise.isWeighted());
        assertEquals("Legs", exercise.getBodyPart());
        assertFalse(exercise.isMachine());
        assertEquals(3, exercise.getSets());
        assertEquals(10, exercise.getRepetitions());
    }

}
