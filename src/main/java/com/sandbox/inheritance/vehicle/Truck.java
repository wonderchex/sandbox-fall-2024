package com.sandbox.inheritance.vehicle;

public class Truck extends LandCraft {

    @Override
    public void transport() {
        System.out.println("Transporting truck stuff.");
    }

    @Override
    public void accellerate() {
        System.out.print("Truck is accelerating.");
    }
}
