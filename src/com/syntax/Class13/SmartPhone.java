package com.syntax.Class13;

public class SmartPhone {
    String brand;
    String apps;
    String color;
    String type;
    String company;
    void call(String phonenumber){
        System.out.println(brand+"Calling"+phonenumber);
    }
    void game(){
        System.out.println(brand+"Can play games");
    }
    void text(){
        System.out.println(brand+"Can text");
    }
    void pics(){
        System.out.println(brand+"take pics");
    }

    public static void main(String[] args) {
        
    }
}


