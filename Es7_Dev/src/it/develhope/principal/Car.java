package it.develhope.principal;

public class Car extends Vehicle {

    public int numberOfDoors;
    public double carPrice;

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("The number of doors of the car is: " + numberOfDoors);
    }

    @Override
    public void doVehicleSound() {
        System.out.println("The car sound is VROOM VROOM");
    }

    public Car(int wheels, int doors, double price){
        this.type = "Car - ";
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
    }
}
