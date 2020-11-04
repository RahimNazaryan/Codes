package com.syntax.Class15;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {

        String name = "Buruj Maria Qasim";
        String [] array = name.split(" ");

        for(String name1 : array){
            System.out.println(name1);
        }
        System.out.println(Arrays.toString(array));
    }
}
