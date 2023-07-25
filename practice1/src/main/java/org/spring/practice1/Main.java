package org.spring.practice1;

import org.spring.practice1.beans.Vehicle;
import org.spring.practice1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        Vehicle notAffectBySpringVeh = new Vehicle();
        notAffectBySpringVeh.setName("Ahihi");
        System.out.println(notAffectBySpringVeh.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println(veh.getName());

        String hello = context.getBean(String.class);
        System.out.println(hello);

        Integer num = context.getBean(Integer.class);
        System.out.println(num);
    }
}