package it.develhope.principal;

public abstract class Vehicle {

    public String type;
    public int numberOfWheels;

    public void showVehicleDetails() {
        System.out.println("Type and number of wheels: " + type + numberOfWheels);
    }

    public abstract void doVehicleSound();
}
