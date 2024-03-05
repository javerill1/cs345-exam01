package edu.ithaca.dturnbull.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void createUserTest() {
        User user = new User("Paul Averill", "24", "male", 72.0, 175.0);

        assertEquals("Paul Averill", user.getName());
        assertEquals("24", user.getAge());
        assertEquals("male", user.getGender());
        assertEquals(72.0, user.getHeight());
        assertEquals(175.0, user.getWeight());
    }
    
}
