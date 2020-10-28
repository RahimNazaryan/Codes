package com.syntax.Class13;

public class Account {

    String accountId;
    String userName;
    String password;
    double balance;
    double limit;
    String typeOfAccount;

    boolean login(String enteredUserName, String enteredPassword){
      if(userName.equals(enteredUserName) && password.equals(enteredPassword)){
          return  true;
      }else{
          return false;
      }
    }
}
