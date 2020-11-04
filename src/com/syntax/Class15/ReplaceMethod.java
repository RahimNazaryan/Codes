package com.syntax.Class15;

public class ReplaceMethod {
    public static void main(String[] args) {
        //Replace method only change a single charector in string./

        String name = new String("Fahim Rahim zahim");
        System.out.println(name.replace('a','e'));

        System.out.println(name.replaceAll("Rahim","Khan"));
    }
}
