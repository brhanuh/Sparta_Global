package org.example.test;

import org.example.Main;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testGetMessage(){
        String result = Main.getMessage("Hanibal");
        String expected = "Welcome, Hanibal, to this program!";
        assertEquals(expected, result);
    }
}
