package org.example;

public enum Planets {
    //Mass = mass * 10^24 in kg
    //Distance from Sun = distance * 10^6 in km
    MERCURY("Mercury", 0.330, 57.9),
    VENUS("Venus", 4.87, 108.2),
    EARTH("Earth", 5.97, 149.6),
    MARS("Mars", 0.642, 228.0),
    JUPITER("Jupiter", 1898.0, 778.5),
    SATURN("Saturn", 568.0, 1432.0),
    URANUS("Uranus", 86.8, 2867.0),
    NEPTUNE("Neptune", 102.0, 4515.0),
    PLUTO("Pluto", 0.0130, 5906.4);

    private final String name;
    private final double mass, distanceFromSun;
    private Planets(String name, double mass, double distanceFromSun){
        this.name = name;
        this.mass = mass;
        this.distanceFromSun = distanceFromSun;
    }

    public String getName(){
        return name;
    }
    public double getMass(){
        return mass;
    }
    public  double getDistanceFromSun(){
        return distanceFromSun;
    }
}

