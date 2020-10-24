package com.syntax.class11;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		char[][] $array = new char[3][4];
		// add values to first row;
		$array[0][0]='A';
		$array[0][1]='B';
		$array[0][2]='C';
		$array[0][3]='D';
		
		// 2nd Row
		
		$array[1][0]='E';
		$array[1][1]='F';
		$array[1][2]='G';
		$array[1][3]='H';
		
		//3rd Row
		
		$array[2][0]='I';
		$array[2][1]='J';
		$array[2][2]='K';
		$array[2][3]='L';
		
		//Accessing elements from arrays using for loops 
		
		for( int i = 0 ; i < $array.length ; i++ ) {
			for(int j = 0 ; j < $array.length; j ++) {
				System.out.print($array[i][j]);
			}
		}
		System.out.println();
		
		
		// printing element from arrays one by one 
		System.out.println($array[2][1]);
		
		// 2nd way of creating an arrays;
		
		
		int[][] array = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15}};
		
		System.out.println(array[2][4]);

	}

}
