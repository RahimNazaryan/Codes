package com.syntax.Class13;

public class LaptopMain {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.make="Mac";
        laptop.model = "Pro 16";
        laptop.RAMCapacity=16;
        laptop.color="pink";
        laptop.processor="Core i7";
        laptop.GPU="Nvidia RTX 3090 12GB DDR6x";
        // Behavior of a laptop
        laptop.PlayMovies();
        laptop.browseInternet();
        laptop.makeVideoCall("Trump");
        String model = laptop.getModel();
        System.out.println(model);
        System.out.println(laptop.getRamCapacity());
        // using void it will print the result but not assign any value
        System.out.println(laptop.multiply(10,20));
        laptop.multiply(23,4);
        laptop.multiply(333,45);




    }
}
