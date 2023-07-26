package org.example7;

import org.example7.beans.Person;
import org.example7.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before 'Lazy' Person");
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
//        String[] vehicles = context.getBeanNamesForType(Vehicle.class);
//        Vehicle vehicle = context.getBean(Vehicle.class);

        System.out.println(person);
        System.out.println("*********************");

//        vehicle.getVehicleService().playingMusic();
//        vehicle.getVehicleService().movingVehicle();
        person.getVehicle().getVehicleService().playingMusic();
        person.getVehicle().getVehicleService().movingVehicle();
    }
}