package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		
		//lets ask user how many names you would like to store and then store those names.
		
		Scanner scan = new Scanner(System.in);
		String[] name;
		int size ;
		System.out.println("How many names would you like to store");
		size = scan.nextInt();
		name=new String[size];
		// we are storing values into an arrays
		for( int i = 0 ; i < size; i ++) {
			System.out.println("Please enter the name");
			name[i] = scan.next();
		}
		//we are retrieving values from an array
		for( int i = 0; i < name.length; i++) {
			System.out.print(name[i]+" ");
			name[i]=scan.nextLine();
			
		
		}
		// task class.
		
					String[] cars= {"BMW","TOYOTA","HONDA","HUNDAI","FORD"};
					for (int i = 0 ; i <cars.length; i ++) {
						System.out.println(cars[i]);
					}
					
					// enhanced for loops mean for each for loops
					// with string
					for(String vari:cars) {
						System.out.println(vari);
					}
					// with intigers
					int[] numbers = {10,20,30,40};
					for(int num : numbers) {
						System.out.println(num);
					}
					// with booleans
					
					
	}

}
