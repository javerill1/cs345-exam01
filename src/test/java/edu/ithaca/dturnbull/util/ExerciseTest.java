package edu.ithaca.dturnbull.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExerciseTest {

    @Test
    public void exerciseTest() {
        // Create a 'squat' exercise
        Exercises exercise = new Exercises("Squat", "Lower body exercise", "Intermediate", true, "Legs", false, 3, 10);

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

    @Test
    public void selectDifficultyLevelTest() {
        Exercises exercise1 = new Exercises("Squat", "Lower body exercise", "Intermediate", true, "Legs", false, 3, 10);
        assertEquals("Beginner difficulty level selected.", exercise1.selectDifficultyLevel("beginner"));
        Exercises exercise2 = new Exercises("Squat", "Lower body exercise", "Intermediate", true, "Legs", false, 3, 10);
        assertEquals("Intermediate difficulty level selected.", exercise2.selectDifficultyLevel("intermediate"));
        Exercises exercise3 = new Exercises("Squat", "Lower body exercise", "Intermediate", true, "Legs", false, 3, 10);
        assertEquals("Advanced difficulty level selected.", exercise3.selectDifficultyLevel("advanced"));
        Exercises exercise4 = new Exercises("Squat", "Lower body exercise", "Intermediate", true, "Legs", false, 3, 10);
        assertEquals("Invalid difficulty level selected.", exercise4.selectDifficultyLevel("expert"));
    }

    @Test
    public void selectWeightedTest() {
        Exercises exercise1 = new Exercises("Squat", "Lower body exercise", "Intermediate", true, "Legs", false, 3, 10);
        assertEquals("This exercise is performed with weights.", exercise1.selectWeighted(true));
        Exercises exercise2 = new Exercises("Squat", "Lower body exercise", "Intermediate", true, "Legs", false, 3, 10);
        assertEquals("This exercise is performed without weights.", exercise2.selectWeighted(false));
    }

    @Test
    public void selectBodyPartTest() {
        Exercises exercise1 = new Exercises("Squat", "Lower body exercise", "Intermediate", true, "Legs", false, 3, 10);
        assertEquals("Legs selected", exercise1.selectBodyPart("legs"));
        Exercises exercise2 = new Exercises("Squat", "Lower body exercise", "Intermediate", true, "Legs", false, 3, 10);
        assertEquals("Chest selected", exercise2.selectBodyPart("chest"));
        Exercises exercise3 = new Exercises("Squat", "Lower body exercise", "Intermediate", true, "Legs", false, 3, 10);
        assertEquals("Invalid body part selected", exercise3.selectBodyPart("shoulders"));
    }

    @Test
    public void selectMachineTest() {
        Exercises exercise1 = new Exercises("Squat", "Lower body exercise", "Intermediate", true, "Legs", false, 3, 10);
        assertEquals("This exercise is performed with a machine.", exercise1.selectMachine(true));
        Exercises exercise2 = new Exercises("Squat", "Lower body exercise", "Intermediate", true, "Legs", false, 3, 10);
        assertEquals("This exercise is performed without a machine.", exercise2.selectMachine(false));
    }

}
