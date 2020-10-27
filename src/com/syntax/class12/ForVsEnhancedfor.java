package com.syntax.class12;

public class ForVsEnhancedfor {

	public static void main(String[] args) {
		
		int[]  num = {10,20,30,1};// num.length = 4
		
		for(int i = num.length-1 ; i >= 0 ; i -- ) {
			System.out.println(num[i]);
		}
		
		// we can not loop backward using enhanced for loop.
		// it start from the beginning of the loop and stop at the end

	}

}
