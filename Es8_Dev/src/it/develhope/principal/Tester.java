package it.develhope.principal;

public class Tester {

    public static void main(String[] args) {

        SmartphonePrice producer1 = new SmartphonePrice("iPhone", 500);
        SmartphonePrice producer2 = new SmartphonePrice("Samsung S12", 300);

        SmartphonePrice retail1 = new SmartphonePrice("iPhone", 1000);
        SmartphonePrice retail2 = new SmartphonePrice("Samsung S12", 800);

        Smartphone phone1 = new Smartphone("Apple", "iPhone 13", 3, producer1, retail1);
        Smartphone phone2 = new Smartphone("Samsung", "S12", 2, producer2, retail2);

        System.out.println(phone1);
        System.out.println(phone2);

        boolean out = phone1.equals(phone2);
        System.out.println("Is phone 1 equals to phone 2? " + out);

        try {
            Smartphone clonedPhone = (Smartphone) phone2.clone();
            System.out.println(clonedPhone);
            boolean same = phone2.equals(clonedPhone);
            System.out.println("Is phone 2 equals to the new clonedPhone? " + same);
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("ERROR");
        }
    }
}
