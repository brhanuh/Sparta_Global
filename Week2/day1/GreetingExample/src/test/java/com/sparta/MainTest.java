package com.sparta;

import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MainTest {
    @Test
    @DisplayName("Returns good evening")
    public void greetingMessage(){
        int time = 21;
        String expectedGreeting = "Good evening";
        String result = Main.greeting(time);
        Assertions.assertEquals(expectedGreeting, result);
    }
    @Test
    @DisplayName("Returns good morning")
    public void afternoon(){
        int time = 14;
        String expectedGreeting = "Good afternoon";
        String result = Main.greeting(time);
        Assertions.assertEquals(expectedGreeting, result);
    }
    @Test
    @DisplayName("Returns good morning")
    public void morning(){
        int time = 21;
        String expectedGreeting = "Good morning";
        String result = Main.greeting(6);
        Assertions.assertEquals(expectedGreeting, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {5, 8, 10, 6, 12})
    @DisplayName("Returns good morning for array of times")
    public void randomMorning(int time){
        System.out.println("time: " + time);
        String expected = "Good morning";
        String result = Main.greeting(time);
        Assertions.assertEquals(expected, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 20, 24, 23})
    @DisplayName("Returns good evening for array of times")
    public void randomEvening(int time){
        System.out.println("time: " + time);
        String expected = "Good evening";
        String result = Main.greeting(time);
        Assertions.assertEquals(expected, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {14, 18, 13, 15})
    @DisplayName("Returns good afternoon for array of times")
    public void randomAfternoon(int time){
        System.out.println("time: " + time);
        String expected = "Good afternoon";
        String result = Main.greeting(time);
        Assertions.assertEquals(expected, result);
    }
}
