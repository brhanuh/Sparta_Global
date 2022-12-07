package org.example;

public abstract class PizzaToppingDecorator implements Pizza{

    // Composition (HAS-A relationship)
    // use this property to link one decorator to another

    protected Pizza pizza;
    public PizzaToppingDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String prepare() {
        return pizza.prepare();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }
}
