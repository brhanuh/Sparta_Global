package org.example.shapes;

public class Trapezium extends Shape{
    private double firstBase, secondBase, height;

    public Trapezium(double firstBase, double secondBase, double height){
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return ((firstBase+secondBase)*height)/2;
    }
}
