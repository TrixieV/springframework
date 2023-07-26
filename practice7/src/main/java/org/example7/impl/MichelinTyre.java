package org.example7.impl;

import org.example7.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyre implements Tyre {

    @Override
    public void rotate() {
        System.out.println("Rotating Michelin tires...");
    }
}
