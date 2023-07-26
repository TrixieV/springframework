package org.example7.service;

import org.example7.interfaces.Speaker;
import org.example7.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
    @Autowired
    private Speaker speaker;

    @Autowired
    private Tyre tyre;

    public void playingMusic() {
        speaker.makeSound();
    }

    public void movingVehicle() {
        tyre.rotate();
    }

    public VehicleService(Speaker speaker, Tyre tyre) {
        this.speaker = speaker;
        this.tyre = tyre;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
}
