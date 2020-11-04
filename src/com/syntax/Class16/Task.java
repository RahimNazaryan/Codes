package com.syntax.Class16;

import java.sql.SQLOutput;

public class Task {

    public static void isStringPalindrome(String string){

        int i = 0 ;
        int j = string.length()-1;
        while(i<j){
            if(string.charAt(i)!=string.charAt(j)){
                System.out.println("String is not palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("String is Palindrome");
    }


    public static void highestNumber( int num1, int num2){

        int largest = num1;
        if(num1< num2){
            largest=num2;
        }else{
           largest=largest;
        }
        System.out.println(largest);
    }

    public static void oddEven(int number){
        String OddEven;
        if(number%2==0 ){
            OddEven="Even";
        }else{
            OddEven="Odd";
        }
        System.out.println(number+" "+OddEven);
    }

    public static void Palindrome(String Name){
      String OriginalName = Name;
      String Reverse="";

            for(int i = OriginalName.length()-1 ; i >= 0; i--){
                Reverse=Reverse+Name.charAt(i);
            }
        System.out.println(Reverse);
            if(Reverse.equalsIgnoreCase(OriginalName)){
                System.out.println(Reverse+" Is palindrome");
            }else{
                System.out.println(Reverse+" Is not Palindrome");
            }
        }

        public static void country (String Country){
            switch (Country.toLowerCase()){
                case "france":
                    System.out.println("BONJOUR");
                    break;

                case "afghanistan":
                    System.out.println("Salam");
                    break;

                case "USA":
                    System.out.println("Hello");
                    break;
            }
            }




            }










