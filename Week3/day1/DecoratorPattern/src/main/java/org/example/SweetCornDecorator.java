package org.example;

public class SweetCornDecorator extends PizzaToppingDecorator{
    public SweetCornDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String prepare() {
        String sweetcornTopping = "Adding sweetcorn";
        return super.prepare() + " " + sweetcornTopping;
    }

    @Override
    public double getPrice() {
        double sweetCornPrice = 1.00;
        return super.getPrice() + sweetCornPrice;
    }
}
