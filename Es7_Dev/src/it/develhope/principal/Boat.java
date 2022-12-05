package it.develhope.principal;

public class Boat extends Vehicle{

    public double maxKnotsSpeed;
    public int boatKilosWeight;

    @Override
    public void doVehicleSound() {
        System.out.println("The sound of the boat is VVVVVVV");
    }

    public Boat(double maxSpeed, int weight){
        this.type = "Boat - ";
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    public String getBoatWeightAndSpeed(){
        return "Boat : max speed is " + maxKnotsSpeed + " and weight is " + boatKilosWeight + " kg";
    }
}
