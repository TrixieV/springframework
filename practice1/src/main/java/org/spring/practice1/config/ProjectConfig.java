package org.spring.practice1.config;

import org.spring.practice1.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("honda");
        return veh;
    }

    @Bean
    String hello() {
        return "Hello from hello bean";
    }

    @Bean
    Integer number() {
        return 27;
    }
}
