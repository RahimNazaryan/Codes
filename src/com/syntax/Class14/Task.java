package com.syntax.Class14;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       String name;       String passWord; String confirm;
        System.out.println("Please enter Your User Name");
        name=scan.nextLine();
        System.out.println("Please enter you pass word");
        passWord=scan.next();
        System.out.println("Please confirm your password");
        confirm=scan.nextLine();


       if((name.isEmpty() || passWord.isEmpty())){
           System.out.println("User name and password can not be empty");

       }else{
           if(passWord.length()<8){
               System.out.println("Password is to short");
           }else{
               if (passWord.contains(name)) {
                   System.out.println("password can not be user name");
               }else{
                   if(!passWord.equals(passWord)){
                       System.out.println("Password Do not match");
                   }else{
                       System.out.println("User Name and Password Created");
                   }
               }
               }
           }
       }


    }
