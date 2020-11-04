package com.syntax.Class17;

public class Task1 {
    String createEmail(String firstName, String lastName , String emailType){
        return firstName+lastName+"@"+emailType+".com";
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        String email = task1.createEmail("Abdul","Rahim","yahoo");
        System.out.println(email);
    }

}
