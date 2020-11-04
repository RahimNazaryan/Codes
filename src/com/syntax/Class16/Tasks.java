package com.syntax.Class16;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
        /*
        Print a sentence word by word reverse
         */

        String sentence = "Welcome to PUBG";
        String [] StringArraySentence=sentence.split(" ");
        System.out.println(Arrays.toString(StringArraySentence));

        for (int i = 0 ; i < StringArraySentence.length; i++){
            StringBuilder stringBuilder = new StringBuilder(StringArraySentence[i]);
            StringArraySentence[i]=stringBuilder.reverse().toString();

        }
        System.out.println(Arrays.toString(StringArraySentence));
    }
}
