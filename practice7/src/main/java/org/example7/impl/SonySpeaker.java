package org.example7.impl;

import org.example7.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speaker {

    @Override
    public void makeSound() {
        System.out.println("Playing Sony speaker...");
    }
}
