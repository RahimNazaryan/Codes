package com.syntax.Class13;

public class Laptop {

    String make;
    String model;
    int hardDriveCapacity;
    int RAMCapacity;
    String color;
    String processor;
    String GPU;

    //void will not return any value its just for writing an statement or printing.
    void PlayMovies(){
        System.out.println("Playing Movies");
    }
    void browseInternet(){
        System.out.println("Browse Internet");
    }
    // inside the premises called arguments

    void makeVideoCall(String contact){
        System.out.println("Video calling to "+contact);
    }

    public String getModel(){
      return model;
    }
    int getRamCapacity(){
        return RAMCapacity*2;
    }

     double multiply(double a  ,double b ){
       return a*b;

    }
    void Multiply(double a , double b){
        System.out.println(a*b);

    }
}
