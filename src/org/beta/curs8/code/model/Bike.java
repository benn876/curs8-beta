package org.beta.curs8.code.model;

public class Bike extends Vehicle{
    private final Integer numberOfWheels;
    private final String color;
    private final String name;

    public Bike(Integer numberOfWheels, String color, String name) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.name = name;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name){
//        this.name = name;
//    }

    public final void createBikes(){
        System.out.println("Creating super bikes");
    }

    @Override
    public void move(){
        System.out.println("The bike is moving.");
    }

    @Override
    public String toString() {
        return "Bike: numberOfWheels: %s, color: %s, name: %s".formatted(numberOfWheels,color,name);
    }
}
