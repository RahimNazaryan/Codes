package com.syntax.class9;

public class NestedLoopsDemo {

	public static void main(String[] args) {
		
		
			for(int i = 0 ; i < 3; i++) {
				System.out.println("Hello");
			for(int j = 0; j < 3; j++ ) {
				System.out.println("Bye");
			}
			System.out.println("========");
			}
			
			System.out.println("=====2nd Example=====");
			
			for (int i = 10 ; i <=14 ; i ++) {
				System.out.println(i);
			for (int o = 1 ; o <= 4 ; o ++) {
				System.out.println(o);
				
			}
			System.out.println("========");
			}
		
			for (int i = 1; i <= 10 ; i ++) {
				for(int k = 1 ; k<=4 ; k++) {
					System.out.println("i="+i+"   j="+k);
				}
				System.out.println("============");
			}
		 
			//printing numbers from 1 to 99
			
			for (int i = 0 ; i <= 9 ; i++) {
				for (int p = 0 ; p <=9 ; p++) {
					System.out.println(i+""+p);
				}
			}
			
			// Militry clock using for loops
			for (int h = 0 ; h <=23 ; h ++) {
				for(int m = 0  ; m <60 ; m ++) {
					
					if(h<10) {
						if(m<10) {
							System.out.println("0"+h+":"+"0"+m);
						}else {
							System.out.println("0"+h+":"+m);
						}
						
					}else {
						if(m<10) {
							System.out.println(h+":0"+m);
						}else {
							System.out.println(h+":"+m);
						}
						
					}

					}
					
					}
			
					// car Odometer;
			
			
			 for(int i=0; i<10; i++) {
				 for(int j=0; j<10; j++) {
					 for(int c=0; c<10;c++) {
						 for(int d=0;d<10; d++) {
							 for(int g=0;g<10;g++) {
								 System.out.println(i+""+j+""+c+""+d+""+g);
						}
					}
			
			
			
				
				}
				 }
			 }
	}
}


