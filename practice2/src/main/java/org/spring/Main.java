package org.spring;

import org.spring.beans.Vehicle;
import org.spring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        veh.hello();
        System.out.println(veh.getName());

        context.close();
    }
}