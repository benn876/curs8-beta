package org.beta.curs8.code.model;

public class MountainBike extends Bike {

    private String suspension;

    public MountainBike(Integer numberOfWheels, String color, String name, String suspension) {
        super(numberOfWheels, color, name);
        this.suspension = suspension;
    }

    public String getSuspension() {
        return suspension;
    }

    // this - current reference
    // super - parent reference
    @Override
    public void move() {
        super.move();
        System.out.println("The mountain bike is moving!");
    }

    public void showSomething(){
        showSomething("Do Something");
    }

    public void showSomething(String message){
        System.out.println(message);
    }
}
