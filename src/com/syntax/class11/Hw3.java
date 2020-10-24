package com.syntax.class11;



public class Hw3 {

public static void main(String[] args) {
		
		
		
		String[] countries = { "USA", "Ukraine", "Canada" };
				String[] capitals = { "DC", "Kyiv", "Ottawa" };
				for (int v = 0; v < countries.length; v++) {
					System.out.println("The capital of " + countries[v] + " is " + capitals[v]);
				}
				
				
				String capital = null;
				
				for(String country : countries) {
					
					switch(country) {
					
					case"USA":
					capital="DC";
					break;
					
					case"Ukraine":
					capital = "Kyiv";
					break;
					
					case"Canada":
					capital="Ottawa";
					break;
					
					default:
						
					}
					 System.out.println("the capital of the "+country+" is "+capital);
				}

	}

}
