package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
//        String name = "Hanibal";
//        System.out.println(name);
//        name = name.toUpperCase();
//        System.out.println(name);
        String [] arr = {"blue", "red", "blue", "yellow", "blue", "red"};
        System.out.println(CountWords.CountAWord(arr, 'b'));

        System.out.println(CountWords.countWordsInString("Hello world, testing strings. world wide web.", 'w'));

        int[] myInts = {1, 2, 3, 4, 5};
        System.out.println("Sum of Array: " + Numbers.SumOfIntegers(myInts));
    }
}