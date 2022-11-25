package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Planets planet;
        planet = Planets.EARTH;

        System.out.println("Planet name: " + planet.getName());
        System.out.println("Planet Mass 10^24 kg: " + planet.getMass());
        System.out.println("Planet distance from sun 10^6 km: " + planet.getDistanceFromSun());
    }
}