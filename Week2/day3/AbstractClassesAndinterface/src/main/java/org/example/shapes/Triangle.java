package org.example.shapes;

public class Triangle extends Shape{
    private double base, height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return (base*height)/2;
    }
}
