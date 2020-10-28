package com.syntax.Class13;

public class Garage {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.numberOfDoors = 4 ;
        car1.Color = "black";
        car1.size = 4;
        car1.make = "BMW";
        car1.model = "I8";


        Car car2 = new Car();
        car2.numberOfDoors = 2 ;
        car2.Color = "blue";
        car2.size = 2 ;
        car2.make = "Honda";
        car2.model = "Civic";

        System.out.println(car1.make);
        System.out.println(car2.make);
    }

}
