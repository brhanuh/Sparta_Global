package org.example;

public class Customers implements Comparable<Customers>{
    private String firstName;
    private String lastName;

    public Customers(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return
                firstName  + " " +
                 lastName;
    }

    @Override
    public int compareTo(Customers customers) {
        return lastName.compareTo(customers.getLastName());
    }
}
