package com.syntax.Class15;

import java.util.Arrays;

public class Task2Class {
    public static void main(String[] args) {


        String name = ("Rahim Khan Nazaryan");
        System.out.println(name.replaceAll(" ",""));

        String name1 = "Is it Raining? Do we have a java class Today? Is it raining?";
        String [] array = name1.split("/?");
        System.out.println(Arrays.toString(array));

        String numbers = "123456789abfiafjh  akjdfga AAAA";
        System.out.println(numbers.replaceAll("[^0-9]",""));
        System.out.println(numbers.replaceAll("[^0-9]","").length());



    }
}