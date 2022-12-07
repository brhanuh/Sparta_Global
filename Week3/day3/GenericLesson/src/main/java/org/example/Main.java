package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        List<Person> myList = new ArrayList<>();
        myList.add(new Person("Hanibal", "Brhanu"));
        myList.add(new Person("Star", "Cat"));
        System.out.println(myList.get(1).getFirstName());

    }
}