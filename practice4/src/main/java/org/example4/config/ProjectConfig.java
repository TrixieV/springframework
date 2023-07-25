package org.example4.config;

import org.example4.beans.Person;
import org.example4.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean("honda")
    Vehicle vehicle() {
        Vehicle veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

//    @Bean
//    Person person() {
//        Person person = new Person();
//        person.setName("Ti");
//        person.setVehicle(vehicle());
//        return person;
//    }

    @Bean
    Person person(Vehicle veh) {
        Person person = new Person();
        person.setName("Ti");
        person.setVehicle(veh);
        return person;
    }
}
