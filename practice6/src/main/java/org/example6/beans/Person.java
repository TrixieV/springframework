package org.example6.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Ti";

//    @Autowired
    private Vehicle vehicle;

//    @Autowired
//    public Person(Vehicle vehicle1) {
//        System.out.println("Person created");
//        this.vehicle = vehicle1;
//    }

    @Autowired
    public Person(@Qualifier("vehicle1") Vehicle vehicle) {
        System.out.println("Person created");
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

//    @Autowired
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Person's name: " + name +
                "\nVehicle: " + vehicle.getName();
    }
}
