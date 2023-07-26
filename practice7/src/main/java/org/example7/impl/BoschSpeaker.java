package org.example7.impl;

import org.example7.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoschSpeaker implements Speaker {

    @Override
    public void makeSound() {
        System.out.println("Playing Bosch speaker...");
    }
}
