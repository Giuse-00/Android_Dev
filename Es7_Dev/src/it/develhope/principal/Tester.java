package it.develhope.principal;

public class Tester{

    public static void main(String[] args) {

        Car car = new Car(4, 5, 3000.50);
        Boat boat = new Boat(123.34, 345);

        car.showVehicleDetails();
        car.doVehicleSound();

        boat.showVehicleDetails();
        boat.doVehicleSound();

        String method = boat.getBoatWeightAndSpeed();
        System.out.println(method);

    }

}
