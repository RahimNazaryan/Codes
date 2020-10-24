package com.syntax.class8;

import java.util.Scanner;

public class ClassTakLoops2 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	for (int  i = 1 ; i <=50 ; i++) {
		if(i%3==0) {
		continue;
		}
		System.out.print(i+ " ");
	}
	System.out.println();
	
	// Second task for credit card apply.
	
	String response;
	do {
		System.out.println("Do you wanna apply for credit card");
		response = scan.next();
	}while(!response.equals("yes")); {
		System.out.println("Approved");
	}
	
	// Task three
	
	System.out.println("Please enter two different number");
	int start = scan.nextInt();
	int end = scan.nextInt();
	int sumEven = 0;
	int sumOdd = 0;
	for (int i = start; i <= end; i++) {
	    if (i%2 == 0) {
	        sumEven += i;
	    } else {
	        sumOdd += i;
	    }
	}
	System.out.println("The sum of even number from start to end that you entered is " + sumEven);
	System.out.println("The sum of odd number from start to end that you entered is " + sumOdd);
	
	System.out.println("Please enter what item you're buying and price.");
	String item=scan.nextLine();
	System.out.println("the Price for the"+item +" is: ");
	double price=scan.nextDouble();
	System.out.println("Please enter how much you will pay.");
	double payment=scan.nextDouble();
	double balance=price-payment;
	for (double a=payment; a<=price; a--) {
		if(payment!=price) {
			System.out.println("You owe "+balance);
			break;
	}else if(payment==price){
		System.out.println("Enjoy your "+item);
		break;
	}else if(payment>price){
		System.out.println("please enter valid range");
	
	}

}
	}
}
