package edu.ithaca.dturnbull.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    
}
