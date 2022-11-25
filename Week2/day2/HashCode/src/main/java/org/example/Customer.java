package org.example;

import java.util.Objects;

public class Customer {
    private String firstName;
    private String lastName;
    public Customer(String firstname, String lastname){
        this.firstName = firstname;
        this.lastName = lastname;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object c){

        if(this == c){
            return true;
        }
        //returns false if object is null or object is not of type Customer
//        if(c == null || this.getClass() != c.getClass()) {
//            return false;
//        }
        //Same as above but has built in null check and checks if object is instance of class
        if(!(c instanceof Customer)){
            return false;
        }
        Customer c1 = (Customer) c;
        return this.getFirstName().equals(c1.getFirstName()) && this.getLastName().equals(c1.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
