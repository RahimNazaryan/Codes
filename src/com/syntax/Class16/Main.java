package com.syntax.Class16;

public class Main {
    public static void main(String[] args) {

        VoidMethods voidMethods=new VoidMethods();
        voidMethods.print();
        voidMethods.print("Afghanistan");

        Task task = new Task();
        Task.highestNumber(5,1);
        Task.oddEven(4);
        Task.Palindrome("");
        Task.country("france");
        Task.isStringPalindrome("ava");
    }
}
