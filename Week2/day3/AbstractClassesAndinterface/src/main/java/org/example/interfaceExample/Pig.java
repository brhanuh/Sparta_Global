package org.example.interfaceExample;

public class Pig implements Animal{
    @Override
    public void sleep() {
        System.out.println("Pig falls asleep zzzzzzzzzzz");
    }

    @Override
    public void eat() {
        System.out.println("Pig chows down");
    }
}
