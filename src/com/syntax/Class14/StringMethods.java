package com.syntax.Class14;

public class StringMethods {
    public static void main(String[] args) {

        // Length Method ( it will count the length of the String)
        String name = "Rahim";
        int length = name.length();
        System.out.println(length);

        name="";
        System.out.println(name.length());

        name = "Rahim Khan";
        System.out.println(name.length());

        name = "  Rahim   ";
        System.out.println(name.length());

        if(name.length()>0){
            System.out.println("your great");
        }

        // String to Lower Case;
        // it will change the

        String n = "Rahim";
        System.out.println(n.toLowerCase());

        n = "MOHAMMAD ALI ";
        System.out.println(n.toLowerCase());
        System.out.println(n);
        String n2 = n.toLowerCase();
        System.out.println(n2);
        System.out.println(n);







    }
}
