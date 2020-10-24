package com.syntax.class11;



public class Creating2DArrays {

	public static void main(String[] args) {
		
		// Create 2D array for Food
		//American
		//Italian
		//Afghan
		//Indian
		//Asian
		
		
		String [][] food = {
				{"Steak","Hot Dog","Cheeseburger"},
				{"Pizza","Pasta","Canoli"},
				{"Sushi","Ramen","Fried Rice","Dumplings"},
				{"Kebab","Manto"},
				{"Biryani","masal","Curry","Chicken tikka masala"}
			};
			
		
		for(String[] dishes:food) {
			for(String dish:dishes) {
				System.out.print(dish+" ");
			}
			System.out.println();
		}
		
		for (int i = 0 ; i < food.length; i ++) {
			for(int j = 0 ; j <food[i].length; j ++) {
				System.out.print(food[i][j]+" ");
			}
			System.out.println();
		}

	}

}
