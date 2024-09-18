package com.sandbox.inheritance.vehicle;

public abstract class Vehicle implements Conveyance {

    public static int counter = 0;

    protected boolean engineStarted = false;

    public Vehicle() {
        counter++;
    }

    public void startEngine () {
        System.out.println(this.getClass().getSimpleName() + " Engine Started");
        engineStarted = true;
    }

    public void stopEngine () {
        System.out.println(this.getClass().getSimpleName() + " Engine Stopped");
        engineStarted = false;
    }

}
