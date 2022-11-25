package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Cat cat1 = new Cat("Felix", "Cat");
        Dog dog1 = new Dog("Max", "Dog");
        cat1.printAnimal();
        dog1.printAnimal();
        cat1.makeSound();
        System.out.println("Inherited name: " + cat1.getName());
    }
}