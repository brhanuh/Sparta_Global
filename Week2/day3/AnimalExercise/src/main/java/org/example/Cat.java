package org.example;

public class Cat extends Animals{
    public Cat(String name, String species) {
        super(name, species);
    }

    @Override
    public void makeSound(){
        System.out.println("MEOWWWWWW");
    }
}
