package com.syntax.Class15;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String momsName,dadsName,gender,babyName;
        System.out.println("Please enter Dad's name");
        dadsName=scan.nextLine();
        System.out.println("Please enter Mom's name");
        momsName=scan.nextLine();
        System.out.println("Boy or Girl ?");
        gender=scan.nextLine();
        if(gender.toLowerCase().startsWith("b")){
           String firstPart = dadsName.substring(0,momsName.length()/2);
           String lastPart = momsName.substring(momsName.length()/2);
           babyName=firstPart+lastPart;
        }else if (gender.toLowerCase().startsWith("g")){
            String firstPart = momsName.substring(0,dadsName.length()/2);
            String lastPart = dadsName.substring(momsName.length()/2);
            babyName=firstPart+lastPart;

        }else{
            babyName="No Suggestion";
        }
        System.out.println(babyName);


    }
}
