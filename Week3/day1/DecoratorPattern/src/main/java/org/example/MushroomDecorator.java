package org.example;

public class MushroomDecorator extends PizzaToppingDecorator{
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String prepare() {
        String mushroomTopping = "Adding mushroom.";
        return super.prepare() + " " + mushroomTopping;
    }

    @Override
    public double getPrice() {
        double mushroomPrice = 1.50;
        return super.getPrice() + mushroomPrice;
    }
}
