package com.syntax.class9;

public class Arrays {
	public static void main(String[] args) {
		
		int[] num = new int[5];
		num[0]=310;
		num[1]=210;
		num[2]=190;
		num[3]=120;
		num[4]=100;
		
		// to Access elements from an array?
		System.out.println("Accesing 3rd element "+num[3]);
		// we can calculate elements from arrays
		System.out.println(num[0] + num[4]);
		// to change a value of an element inside the arrays
		
		num[4]= 150;
	}

}
