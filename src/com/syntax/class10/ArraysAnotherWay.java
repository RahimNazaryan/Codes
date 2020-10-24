package com.syntax.class10;

public class ArraysAnotherWay {

	public static void main(String[] args) {
		// in here we can not change the values inside the arrays.
		String[] name = {"Mike","Khan","Danilo","Fahim"};
		
		for(int i = 0 ; i < name.length ; i++) {
			System.out.println(name[i]);
		}
			
		char[]grade = {'A','B','C','D','E','F'};
		System.out.println(grade[1]);
		
		String[]names= {"Rahim","Fahim","Zahim","Baki"};
		System.out.println(names[2]);
		
		String[]java = {"Java","Saturday","day","coding","is"};
		System.out.println(java[1]+" "+java[4]+" "+java[0]+" "+java[2]+" "+java[3]);
		
		}
		

	}


