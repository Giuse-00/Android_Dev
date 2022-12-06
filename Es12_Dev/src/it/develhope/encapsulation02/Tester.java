package it.develhope.encapsulation02;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set the name: ");
        person.name = scanner.nextLine();
        System.out.println("Set the surname: ");
        person.surname = scanner.nextLine();
        System.out.println("Set the height: ");
        person.height = scanner.nextDouble();
        System.out.println("Set the age: ");
        person.age = scanner.nextInt();

        System.out.printf("%s %s is %d years old and is height is %.2f", person.getName(), person.getSurname(), person.getAge(), person.getHeight());
    }
}
