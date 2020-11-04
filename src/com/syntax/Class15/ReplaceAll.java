package com.syntax.Class15;

public class ReplaceAll {
    public static void main(String[] args) {

     String mix= "3212Hello 89 World354545 *&***^&*^&*";
      // System.out.println(mix.replaceAll("[0-9]",""));
      // System.out.println(mix.replaceAll("[a-z]", ""));
      // System.out.println(mix.replaceAll("[a-z A-Z]",""));
        System.out.println(mix.replaceAll("[^A-Z a-z 0-9]",""));
    }
}
