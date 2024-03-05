package edu.ithaca.dturnbull.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void createUserTest() {
        // Create your user
        User user = new User("Paul Averill", "24", "male", 72.0, 175.0);
        assertEquals("Paul Averill", user.getName());
        assertEquals("24", user.getAge());
        assertEquals("male", user.getGender());
        assertEquals(72.0, user.getHeight());
        assertEquals(175.0, user.getWeight());
    }

    @Test
    public void selectExerciseTest() {
        // Create some exercises
        Exercises exercise1 = new Exercises("Squat", "Lower body exercise", "Intermediate", true, "Legs", false, 3, 10);
        Exercises exercise2 = new Exercises("Push-up", "Upper body exercise", "Beginner", false, "Chest", false, 3, 15);
        Exercises exercise3 = new Exercises("Pull-up", "Upper body exercise", "Advanced", true, "Back", false, 3, 8);

        // Create your exercise list
        List<Exercises> allExercises = new ArrayList<>();

        // Then add those created exercises to that list
        allExercises.add(exercise1);
        allExercises.add(exercise2);
        allExercises.add(exercise3);

        // Check to see if the selectExercise() method works properly for the created allExercises List
        assertEquals(exercise1, allExercises.selectExercise("Intermediate", true, "Legs", false)); // check 'Intermediate' exercise 1
        assertEquals(exercise2, allExercises.selectExercise("Beginner", false, "Chest", false)); // check 'Beginner' exercise 2
        assertEquals(exercise3, allExercises.selectExercise("Advanced", true, "Back", false)); // check 'Advanced' exercise 3
        assertNull(allExercises.selectExercise("Beginner", true, "Legs", false)); // check null exercise
    }

}
