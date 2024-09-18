package com.sandbox.inheritance.vehicle;

public abstract class LandCraft extends Vehicle {

    public void transport () {
        System.out.println("Transporting land stuff.");
    }

    public abstract void accellerate();
}
