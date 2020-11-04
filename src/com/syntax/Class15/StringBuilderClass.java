package com.syntax.Class15;

public class StringBuilderClass {
    public static void main(String[] args) {
        // in string builder the original string value will change
        StringBuilder stringBuilder=new StringBuilder("Hello");
        stringBuilder.append(" World");
        System.out.println(stringBuilder);
    }
}
