package org.example;

import java.util.ArrayList;
import java.util.List;

public class NestedDriver {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(List.of("Hanibal Brhanu", "Ben Swenson", "James Bond", "Marcus Rashford"));
        MySorter theSorter = new MySorter();
        System.out.println(l);
        MySorter.sort(l);
        System.out.println(l);

        List<Customers> custList = new ArrayList<>(List.of(new Customers("Hanibal", "Brhanu"), new Customers("Marcus", "Rashford"), new Customers("Eric", "Ten Hag")));
        System.out.println(custList);

        System.out.println(theSorter.sort(custList));
    }
}