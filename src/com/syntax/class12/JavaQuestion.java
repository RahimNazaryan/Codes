package com.syntax.class12;

public class JavaQuestion {

	public static void main(String[] args) {
	
		//write a program to swap 2 numbers without a temporary variable.
		
		int x = 10;
		int y = 20; 
		x=y+x;
		y=x-y;
		x=x-y;
		System.out.println("The Value of X :" +x);
		System.out.println("The Value of Y :" +y);

		
		// Program to check whether a given number is prime or not.
		
		int num = 1; 
		boolean flag = false;
		
		if(num > 1) {
		for (int i = 2 ; i <num ; i ++) {
			if(num % 2 == 0 ) {
				flag = true;
				break;
			}
		}
		}else {
			flag=true;
		}
		if(!flag) {
			System.out.println(num+" is prime number");
		}else {
			System.out.println(num+" is not a prime number");
			}
		
		
		// print the first 10 numbers of fibonachi number;
		
		int a = 0 ;
		int b = 1;
		int sum;
		
		for(int i = 1 ; i <= 10 ; i ++) {
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
			
			//System.out.print(sum);
		}
		// Second largest Number from Arrays.
		int[] array = {1067, 90, 450, -34, 450, 1, 199};
		int max = array[0];
		int secondMax = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				secondMax = max;
				max = array[i];
			} else if (array[i] > secondMax && array[i] != max) {
				
				secondMax = array[i];
			}
		}
		System.out.println(secondMax);
	}

}
