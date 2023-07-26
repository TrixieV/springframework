package org.example7.impl;

import org.example7.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyre implements Tyre {

    @Override
    public void rotate() {
        System.out.println("Rotating Bridge Stone tires...");
    }
}
