package org.beta.curs8.code;

import org.beta.curs8.code.model.Bike;
import org.beta.curs8.code.model.MountainBike;
import org.beta.curs8.code.model.StreetBike;

public class Polymorphism {
    public static void main(String[] args) {
        Bike bike = new MountainBike(4, "red", "Devron", "something");
        Bike otherBike = new StreetBike(3, "black", "Other");

        printTypeOfBike(bike);
        printTypeOfBike(otherBike);
    }

    public static void printTypeOfBike(Bike bike) {
        if (bike instanceof MountainBike mountainBike) {
            System.out.println(mountainBike.getSuspension());
            System.out.println("This is a mountain bike");
        }

        if (bike instanceof StreetBike) {
            System.out.println("This is a street bike");
        }

    }
}
