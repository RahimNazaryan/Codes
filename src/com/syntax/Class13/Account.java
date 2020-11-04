package com.syntax.Class13;

public class Account {

    String accountId;
    String userName;
    String password;
    double balance;
    double limit;
    String typeOfAccount;

    /*
    write a method that takes the amount that user wants to
    transfer it deducts the amount from your balance and return
     the amount of transfer in case of success or a 0 in case of failure
     */
    double amountTransfer(double amountToTransfer) {
            if(amountToTransfer<balance){
                return balance=balance-amountToTransfer;
            }else{
                return 0;
            }
    }

    boolean login(String enteredUserName, String enteredPassword){
      if(userName.equals(enteredUserName) && password.equals(enteredPassword)){
          return  true;
      }else{
          return false;
      }
    }
}
