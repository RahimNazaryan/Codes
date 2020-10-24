package com.syntax.class8;

public class ClassTaskLoops {

	public static void main(String[] args) {
	// print number from 1 to 100;
		
		for (int a = 1 ;  a <= 100 ; a++){
			System.out.print(a+" ");
		}
		System.out.println();
		// print number from 100 to 1
		for( int b = 100 ; b >= 1 ; b--) {
			System.out.print(b+" ");
		}
		System.out.println();
		// print number from 20 to 1 even  number
		for ( int c = 20 ; c >=1 ; c-=2) {
			System.out.print(c+" ");
		}
		
		System.out.println();
		// print even numbers between 20 to 50
		for (int d = 20 ; d <= 50 ; d++ ) {
			if( d % 2 != 0) {
				System.out.println(d+" ");
			}
		}
		
		System.out.println();
		
		int sum = 0 ;
		for (int i = 1 ; i<6 ; i++) {
			sum = sum + i ;
		}
		
		System.out.println(sum);
		
		int result = 1 ; 
		for (int i = 10 ; i >=1 ; i-=2) {
		result*=i;
		System.out.println("Reasult = " +result);
		}
		System.out.println("Total"+result);
		
		// calculate sum of even and number range 1 to 50;
		
		int odd = 0;
		int even = 0;
		
		for (int num = 1 ; num <= 50 ; num ++) {
			
			if(num %2 == 0 ) {
				even = even + num;
			}else {
				odd = odd + num;
			}
			
			
		}
		System.out.println(" the sum of odd number is "+ odd + " and sum of even number is "+even);
		
		// muiltipication Table 
		int num1 = 1 ;
		int muil;
		
		for ( int i = 1 ; i <=10 ; i++ ) {
			muil=num1*i;
			System.out.println(num1+"x"+i+"="+muil);
			
			 
		}
		
		
		
	}

}
