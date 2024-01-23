package com.eg;


/*
Exercise 1: Inheritance
Create a class Vehicle with properties like make, model,
 and a method displayInfo() to print out the details of the vehicle.
  Then, create a subclass Car that inherits from Vehicle and adds
  a property like numDoors and a method startEngine() to simulate starting the car.
*/

public class Car extends Vehicle{

    private int numOfDoors;
    public Car(String make, int model, int numOfDoors) {
        super(make, model);
        this.numOfDoors=numOfDoors;
    }

    public void startEngine(){
        System.out.println("Engine started");
    }


}
