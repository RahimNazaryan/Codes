package com.syntax.class8;

public class BrealAndContinue {

	public static void main(String[] args) {

		
		// break; --> breaks loops and skips all code that you have after break inside the loop
		for (int i=1; i<4; i++) {
		System.out.println("Hello");
		break;
		}
		
		for ( int i=1 ; i <=10 ; i++) {
			if (i == 5) {
				
				break;
			}
			System.out.println(i+" Hello");
		}
		
		// continue; -- >it skip 1 iteration
		// i want to print numbers from 1 to 5 except number 3 
		
		for (int i = 1 ; i <=5 ; i++) {
			if (i==3) {
				continue;
			}
			System.out.println(i);
		}
		
		// i want to print number from 1 to 10 except number 3 & 7
		
		for (int j = 1 ; j <= 10 ; j ++) {
			if (j == 3 || j == 7 ) {
				continue;
			}
			System.out.println(j);
		}
		
	}
	

}
