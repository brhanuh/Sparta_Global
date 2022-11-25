package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter time of day...");
        Scanner userInput = new Scanner(System.in);
        int dayTime = userInput.nextInt();
        String greeting = greeting(dayTime);
        System.out.println(greeting);
    }
    public static String greeting(int dayTime){
        String greeting;
        if(dayTime >= 5 && dayTime <= 12){
            greeting = "Good morning";
        }else if(dayTime > 12 && dayTime <= 18){
            greeting = "Good afternoon";
        }
        else {
            greeting = "Good evening";
        }
        return greeting;
    }
}