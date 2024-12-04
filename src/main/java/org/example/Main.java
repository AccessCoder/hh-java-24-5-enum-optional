package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Weekdays day = Weekdays.SATURDAY;
//        System.out.println(day);
//
//        if (day.getValue().equals("Weekend")) {
//            System.out.println("Thank god its Weekend!");;
//        }

        //Optional
        Optional<Cat> databaseCatOrNot = getCatByName("Felix");
        Cat cat = databaseCatOrNot.orElse(new Cat("UNKNOWN", 0));
        System.out.println(cat.age());

//        if (databaseCatOrNot != null) {
//            System.out.println(databaseCatOrNot.age());
//            System.out.println("Hallo");
//            System.out.println("Total wichtige Berechnung!");
//        }else {
//            System.out.println("Nicht gefunden!");
//        }


    }

    public static Optional<Cat> getCatByName(String name){
        Cat temp = new Cat(name, 3);
        return Optional.ofNullable(null);
    }
}