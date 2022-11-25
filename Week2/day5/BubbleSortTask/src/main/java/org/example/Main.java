package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int[] sort = {5, 1, 4, 2, 8};
        int[] sorted = BubbleSort.sort(sort);
        System.out.println(Arrays.toString(sorted));
        int[] first = {0,1,2,3,4,5};
        int[] second = {6,7,8,9,10};
        int[] merged = BubbleSort.mergeTwoArrays(first, second);
        System.out.println("Merged Arrays: " + Arrays.toString(merged));
    }
}