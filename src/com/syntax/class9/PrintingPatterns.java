package com.syntax.class9;

public class PrintingPatterns {

	public static void main(String[] args) {
		// outer loop control the inner loop
		for(int r = 0 ; r <=6; r ++) {// outer loop
			for(int c = 1 ; c <=12; c ++) {// inner loop
				System.out.print("*");
			}
			System.out.println();
		}
				// this will print the outer loop 5 times
			for (int i = 0 ; i < 5 ; i++) {
				for(int j = 1 ; j<=5 ; j ++) {
					System.out.print(i);
				}System.out.println();
				
			}
			 // this will print the inner loop 5 times the number from 1 to 5 (5 times)
			for (int i = 0 ; i < 5 ; i++) {
				for(int j = 1 ; j<=5 ; j ++) {
					System.out.print(j);
				}System.out.println();
				
			}
			// Print coloumn for up to down ( 7 to 1)
			for (int i = 7 ; i >= 1 ; i--) {
				for (int j = 0 ; j <=6 ; j ++) {
					System.out.print(i);
				}System.out.println();
			}
			
			
	}

}
