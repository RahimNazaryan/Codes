package com.syntax.class11;

public class TaskClass {

	public static void main(String[] args) {
		
		String [] [] _array = {{"Mr", "Mrs", "Ms", "Miss",},{"Smith","Jordan", "Jackson", "Obama",}};
		System.out.print(_array[0][1]+" "+_array[1][0]+", ");
		System.out.print(_array[0][0]+" "+_array[1][3]+", ");
		System.out.print(_array[0][2]+" "+_array[1][2]+", ");
		System.out.print(_array[0][3]+" "+_array[1][1]);
		System.out.println();
		
		
		String [][] cars = {
				{"Ford","Jeep","Dodge"},
				{"Audi","Porsche","BMW"},
				{"Ferrari","Maseratti","Lamborgini"},
		};
		
		for (int i = 0 ; i < cars.length; i++) {
			for(int j = 0 ; j <cars[i].length;j++) {
				System.out.print(cars[i][j]+" ");
			}System.out.println();
		}
		
	System.out.println("_________________________________");
	//printing using enhanced for loop 
	
	for(String[] carArray:cars) {
		for(String car:carArray) {
			System.out.print(car+" ");
		}
		System.out.println();
	}

	}

}
