package org.example6.beans;

public class Vehicle {
    private String name;

//    public Vehicle() {
//        System.out.println("Vehicle created");
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle's name: " + name;
    }
}
