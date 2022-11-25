package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        DayIndex dayOfWeek;
        dayOfWeek = DayIndex.SUNDAY;

        if(dayOfWeek == DayIndex.SATURDAY || dayOfWeek == DayIndex.SUNDAY){
            System.out.println("It's a weekend.");
        }

        PizzaSize size = PizzaSize.LARGE;
        System.out.println("Size: " + size.getPizzaSize());
        System.out.println(size.ordinal());
        System.out.println("Calories: " + size.getPizzaCalories());
        System.out.println("Energy; " + size.getEnergyInJoules());

        System.out.println("Energy of a medium pizaa: " + PizzaSize.valueOf("MEDIUM").getEnergyInJoules());

    }
}