package it.develhope.encapsulation02;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Person {

    public Person(){}

    public String name;
    public String surname;
    public double height;
    public int age;


}
