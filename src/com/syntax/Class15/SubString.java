package com.syntax.Class15;

public class SubString {
    public static void main(String[] args) {

        String name = "Can u write the second m too";
        System.out.println(name.substring(5)); //  5 characters will be ignored
        System.out.println(name.substring(0));//redunant
        //System.out.println(name.substring(-1));// out of boundary Error
        System.out.println(name.substring(5,11)); // can u will be ignore
        System.out.println(name.substring(6,11)+" "+name.substring(16,23));
    }
}
