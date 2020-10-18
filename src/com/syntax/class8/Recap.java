package com.syntax.class8;
import java.util.Scanner;
public class Recap {

	public static void main(String[] args) {
		/*ask user to pay for a water
		 * water price 5
		 * once user enters money than we need tell if we need more money or less
		 */
		
		Scanner scan = new Scanner(System.in);
		int money = 0;
		int waterPrice=5 ;
		System.out.println("Please pay for your water");
		int input = scan.nextInt();
		
		while(money != waterPrice) {
		 if(money>waterPrice) {
			 System.out.println("The amount is too less");
			 
		 }else {
			 System.out.println("the amount is too much");
		 }
		
		}
		System.out.println("Enjoy your water");

	}

}
