package org.beta.curs8.code;

import org.beta.curs8.code.model.Bike;
import org.beta.curs8.code.model.MountainBike;
import org.beta.curs8.code.model.StreetBike;

public class Main {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(2, "red", "Devron", "the best");
        System.out.println(mountainBike.getNumberOfWheels());
        System.out.println(mountainBike.getColor());
        System.out.println(mountainBike.getName());
        System.out.println(mountainBike.getSuspension());

        StreetBike streetBike = new StreetBike(2,"black","Something");
        System.out.println(streetBike.getNumberOfWheels());
        System.out.println(streetBike.getColor());
        System.out.println(streetBike.getName());

        mountainBike.move();

        Bike bike = new Bike(5,"black","BIKE");
        //bike.move();
        System.out.println(bike);
        bike.createBikes();
        mountainBike.createBikes();

        mountainBike.showSomething();
        mountainBike.showSomething("Message");
    }
}
