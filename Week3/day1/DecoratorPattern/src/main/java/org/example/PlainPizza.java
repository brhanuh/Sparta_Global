package org.example;

public class PlainPizza implements Pizza{
    // Say this applies to every pizza at our restaurant
    @Override
    public String prepare() {
        String plain = "Preparing new thin dough";
        return plain;
    }
    // cost of pizza base without any toppings
    @Override
    public double getPrice() {
        double plainPrice = 3;
        return plainPrice;
    }
}
