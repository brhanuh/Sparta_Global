package org.example;

public enum PizzaSize {

    SMALL("Small Pizza", 100),
    MEDIUM("Medium Pizza", 180),
    LARGE("Large Pizza", 230),
    EXTRALARGE("Extra Large", 480);
    private final String pizzaSize;
    private final int calorie;
    private  PizzaSize(String pizzaSize, int calorie){
        this.pizzaSize = pizzaSize;
        this.calorie = calorie;
    }

    public String getPizzaSize(){
        return pizzaSize;
    }

    public int getPizzaCalories(){
        return calorie;
    }

    public int getEnergyInJoules(){
        return (int) (calorie * 4.184);
    }
}
