package org.example5.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name = "Ferrari";

    public Vehicle() {
        System.out.println("Vehicle created");
    }

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
