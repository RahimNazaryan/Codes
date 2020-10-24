package com.syntax.class11;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Double[] num;
		double sum=0;
		System.out.println("Enter the length of the array:");
		int size = scan.nextInt();
		num = new Double[size];
		for (int i = 0; i < size; i++) {
		System.out.println("Enter the numbers");
			num[i] = scan.nextDouble();
			
		}
		for(double add:num)
		{
			
			sum=sum+add;
			
			
		}
	      System.out.println("Sum of array elements is:"+sum);

	}

}
