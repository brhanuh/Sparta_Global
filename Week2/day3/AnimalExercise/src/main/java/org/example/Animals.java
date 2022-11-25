package org.example;

public class Animals {
    private String name;
    private String species;

    public Animals(String name, String species){
        this.name = name;
        this.species = species;
    }
    public void makeSound(){
        System.out.println("A very loud sound!!");
    }
    public void printAnimal(){
        System.out.println("The name is " + this.name + " and species is " + this.species);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
