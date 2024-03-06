package edu.ithaca.dturnbull.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TrainerTest {

    @Test
    public void createTrainerTest() {
        Trainer trainer = new Trainer("Joe Averill", "21", "male", 70.0, 165.0);
        assertEquals("Joe Averill", trainer.getName());
        assertEquals("21", trainer.getAge());
        assertEquals("male", trainer.getGender());
        assertEquals(70.0, trainer.getHeight());
        assertEquals(165.0, trainer.getWeight());
    }

    @Test
    public void addEditRemoveExerciseTest() {
        // Create your trainer to add, edit, and remove exercises
        Trainer trainer = new Trainer("Joe", "21", "male", 70.0, 165.0);
        // Add your new exercise to the existing list of exercises
        Exercises addedExercise = trainer.addExercise("Squat", "Lower body exercise", "Intermediate", true, "Legs", false, 3, 10);
        // Check that the exercise was added to the list of exercises correctly
        assertNotNull(addedExercise);
        assertEquals("Squat", addedExercise.getName());
        assertEquals("Lower body exercise", addedExercise.getDescription());
        assertEquals("Intermediate", addedExercise.getDifficultyLevel());
        assertTrue(addedExercise.isWeighted());
        assertEquals("Legs", addedExercise.getBodyPart());
        assertFalse(addedExercise.isMachine());
        assertEquals(3, addedExercise.getSets());
        assertEquals(10, addedExercise.getRepetitions());

        // Edit a exercise that is in the existing list of exercises
        Exercises editedExercise = trainer.editExercise("Squat", "Lower body exercise updated description", "Advanced", false, "Back", true, 4, 12);
        // Check that the exercise was edited correctly
        assertNotNull(editedExercise);
        assertEquals("Lower body exercise updated description", editedExercise.getDescription());
        assertEquals("Advanced", editedExercise.getDifficultyLevel());
        assertFalse(editedExercise.isWeighted());
        assertTrue(editedExercise.isMachine());
        assertEquals(4, editedExercise.getSets());
        assertEquals(12, editedExercise.getRepetitions());

        // Remove the exercise that is in the existing list of exercises
        Exercises removedExercise = trainer.removeExercise("Squat", "Lower body exercise updated description", "Advanced", false, "Back", true, 4, 12);
        // Check that the exercise was removed correctly
        assertNotNull(removedExercise); 
        assertEquals(addedExercise, removedExercise);
    }
    
}
