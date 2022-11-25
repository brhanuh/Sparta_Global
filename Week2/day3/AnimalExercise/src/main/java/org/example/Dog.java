package org.example;

public class Dog extends Animals{

    public Dog(String name, String species) {
        super(name, species);
    }

    @Override
    public void makeSound(){
        System.out.println("WOOOF WOOF WOOF");
    }
}
