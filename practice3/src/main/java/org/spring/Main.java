package org.spring;

import org.spring.beans.Vehicle;
import org.spring.config.Config3;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config3.class);

        Supplier<Vehicle> hondaSupplier = () -> {
            Vehicle honda = new Vehicle();
            honda.setName("Honda");
            return honda;
        };

        Vehicle bmw = new Vehicle();
        bmw.setName("BMW");
        Supplier<Vehicle> bmwSupplier = () -> bmw;

        Random random = new Random();
        int num = random.nextInt(10);
        System.out.println("Random number: " + num);

        if (num % 2 == 0) {
            context.registerBean("honda", Vehicle.class, hondaSupplier);
        } else {
            context.registerBean("bmw", Vehicle.class, bmwSupplier);
        }

        Vehicle hondaVeh = null;
        Vehicle bmwVeh = null;

        try {
            hondaVeh = context.getBean("honda", Vehicle.class);
        } catch (NoSuchBeanDefinitionException e) {
            System.out.println("Honda not found");
        }

        try {
            bmwVeh = context.getBean("bmw", Vehicle.class);
        } catch (NoSuchBeanDefinitionException e) {
            System.out.println("BMW not found");
        }

        if (hondaVeh != null) {
            System.out.println(hondaVeh.getName() + " is here!");
        } else if (bmwVeh != null) {
            System.out.println(bmwVeh.getName() + " is here!");
        }

    }
}