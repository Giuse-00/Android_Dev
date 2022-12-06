package it.develhope.encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        House house = new House();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please set the floors number: ");
        house.floorsNumber = scanner.nextInt();

        System.out.print("Please set the address: ");
        house.address = scanner.next();

        System.out.print("Please set the resident names: ");
        house.residentNames = scanner.next().split(",");

        System.out.println(String.format("This house has %d floors", house.getFloorsNumber()));
        System.out.println(String.format("The address of this house is %s", house.getAddress()));
        System.out.println(String.format("The resident names are %s", Arrays.toString(house.getResidentNames())));


    }
    }

