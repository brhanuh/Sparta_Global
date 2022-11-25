package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Customer c1 = new Customer("Hanibal", "Brhanu");
        Customer c2 = new Customer("Hanibal", "Brhanu");
        Customer c3 = new Customer("Hanibal", "Brhanu");
        Customer c4 = new Customer("Ben", "Swenson");

        //System.out.println(c1.equals(c3));

        //Test equals contract
        //Reflexive
        System.out.println(c1.equals(c1));
        //Symmetric
        System.out.println(c1.equals(c2));
        //Transitive
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c3));
        //consistent
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c3));
        //objects class equals
        System.out.println("Class equals: " + c1.equals("hello world"));
        //Testing hashcodes
        //Internal consistency
        System.out.println(c1.hashCode());
        System.out.println(c1.hashCode());
        // equals consistency
        System.out.println(c1.equals(c2) + "-> hashcode " + c1.hashCode() + " " + c2.hashCode());
    }
}