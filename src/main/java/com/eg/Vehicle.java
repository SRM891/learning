package com.eg;

/*
Exercise 1: Inheritance
Create a class Vehicle with properties like make, model,
 and a method displayInfo() to print out the details of the vehicle.
  Then, create a subclass Car that inherits from Vehicle and adds
  a property like numDoors and a method startEngine() to simulate starting the car.
*/

public class Vehicle {
    private String make;
    private int model;
    public Vehicle(String make, int model){
        this.make = make;
        this.model = model;
    }

    public void displayinfo(){
        System.out.println("Model:"+this.model+" Make:"+this.make);
    }
}
