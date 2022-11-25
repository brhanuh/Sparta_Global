package org.example.interfaceExample;

public class Goose extends Bird {
    @Override
    public void sleep() {
        System.out.println("Goose snores loudly");
    }

    @Override
    public void eat() {
        System.out.println("Goose picks seeds and eats them");
    }
}
