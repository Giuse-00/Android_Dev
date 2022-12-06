package it.develhope.polymorphism02;

public class Cow extends Animal {

    public Cow(String animalName){
        super(animalName);
    }

    public void animalSound(){
        System.out.println("The cow does MUU");
    }
}

