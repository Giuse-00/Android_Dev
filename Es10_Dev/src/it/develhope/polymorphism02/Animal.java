package it.develhope.polymorphism02;

public class Animal {

    private String animalName;

    public Animal(String animalName){
        this.animalName = animalName;
    }

    public void animalSound(){
        System.out.println("Default animal sound");
    }

}
