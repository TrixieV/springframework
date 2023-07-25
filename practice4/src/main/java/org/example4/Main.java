package org.example4;

import org.example4.beans.Person;
import org.example4.beans.Vehicle;
import org.example4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle honda = context.getBean(Vehicle.class);
        Person ti = context.getBean(Person.class);

        System.out.println(honda);
        System.out.println(ti);
    }
}