package org.example4.beans;

public class Vehicle {
    private String name;

    public Vehicle() {
        System.out.println("Vehicle created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("Hello from vehicle bean");
    }

    @Override
    public String toString() {
        return "Vehicle name: " + name;
    }
}
