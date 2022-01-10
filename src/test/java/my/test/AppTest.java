package my.test;


import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class AppTest {
    @Test
    public void alwaysPass() {
        assertTrue(true);
    }

    @Test
    public void sometimesFail() {
        if (new Random().nextBoolean()) {
            assertTrue(true);
        } else {
            fail("Not this time, my friend");
        }
    }
}
