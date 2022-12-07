package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Pizza mushroomPepperoniPizza = new MushroomDecorator(new PepperoniDecorator(new PlainPizza()));
        Pizza mushroomPepperoniPizza2 = new PepperoniDecorator(new PepperoniDecorator(new PlainPizza()));

        System.out.println(mushroomPepperoniPizza.prepare());
        System.out.println(mushroomPepperoniPizza.getPrice());
    }
}