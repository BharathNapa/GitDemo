package com.loops;

public class LoopingStatemnt {
	
	private static char x;
	private static char z;

	public static void main(String[] args) {
		
		
		
	System.out.println("for loop from 10 to 1");
	
		//for loop from 10 to 1
		
		for(int i = 10; i>=1; i--) {
			
			System.out.print(i + " ");
		}
		
		System.out.println("-------------------------------");
		System.out.println("for loop from 1 to 10");
	
		
		for(int i = 1; i<=10; i++) {
			
			System.out.println(i + " ");
		
	}
		
		System.out.println("-------------------------------");
		
		System.out.println("for loop print even number 1 to 100");
		
		
		for(int i =1; i<=100; i++) {
			
			if(i%2==0) {
				
				System.out.print(i+" ");
		}
		}
		
	System.out.println("-------------------------------");
		
		System.out.println("for loop print even number 100 to 1");
		
		for(int i= 100; i>=1; i-- ) {
			
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
System.out.println("-------------------------------");
		
		System.out.println("for loop print odd number 1 to 100");
		
		for(int i = 1; i<=100; i++) {
			
			if(i%2 != 0) {
				System.out.print(i + " ");
			}
		}
		
System.out.println("***************************************");
		
		System.out.println("for loop print odd number 100 to 1");
		
		for(int i = 100; i>=1; i--) {
			
			if(i%2 != 0) {
				System.out.print(i + " ");
			}
		}
		
	System.out.println("-------------------------------");
		
		System.out.println("for loop print even number 1 to 100 NO IF CONITION");
		
		for(int i = 2; i<=100; i+=2) {
			
			System.out.println(i);
			 
			 
		}
		
		for(int i = 1; i<=1; i++) {
			
			for(int j = 1; j<=10; j++) {
				
				System.out.println(i);
			}
			
			System.out.println();
			
			for(int k = 2; k<=2; k++) {
				
				for(int l = 1; l<=10; l++) {
					
					System.out.print(k);
				}
			
		}
		
		}	
		
		for(int o = 1; o<=3; o++ ) {
			
		for(int j = 1; j<=5; j++) {
			
			System.out.println(j);
		}
			
			System.out.println();
			
		}
		
	
		for(int z =1; z<=3; z++) {
			
			for(char c = 'x'; c<='z'; c++) {
				
				System.out.println(c);
			}
			
			System.out.println();
		}
		
		
		for(int i = 1; i<=5; i++) {
			
			for(int j =1; j<=5; j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		System.out.println("-------------------------Right Triangle or increasing Triange");
		
		
		for(int i =1; i<=5; i++) {   //row
			
			for(int j =1; j<=i; j++) {  // column
				
				System.out.print(" * ");
			}
			
			System.out.println();
		}
		
		
		System.out.println("-------------------------Right downward Triangle or decreasing Triange");
		
		for(int i=1; i<=5; i++) {
			
			for(int j =i; j<=5; j++) {
				
				System.out.print(" * ");
			}
			
			System.out.println();
		
			
			
			}
			
			
		
	
	for(int i = 1; i<=5; i++) {
		
		for(int j = i; j<=5; j++) {
			
			System.out.print(" ");
		}
			
		for(int k=1; k<=i; k++) {
				
				System.out.print("*");
			}
		
		
		System.out.println();
	}
	
	System.out.println("***************");
	
	for(int i =1; i<=5; i++) {
		
		for(int j= 1; j<=i; j++) {
			
			System.out.print(" ");
		}
		
		for(int k=i; k<=5; k++) {
			
			System.out.print("*");
		}
		
		
		System.out.println();
	
}
	
	System.out.println("-------------------------Right Triangle or increasing Triange");
	
	for(int i =1; i<=5; i++) {
		
		for(int j =1; j<=i; j++) {
			
			System.out.print(j + " ");
		}
		
		System.out.println();
	}

	System.out.println("-------------------------Right downward Triangle or decreasing Triange");
	
	for(int i =1; i<=5; i++) {
		
		for(int j=i; j<=5; j++) {
			
			System.out.print(j + " ");
		}
		
		System.out.println();
	}
	
	System.out.println("+++++++++++++++++++++++++++++++++++++");
	
for(int i =5; i>=1; i--) {
		
		for(int j=i; j>=1; j--) {
			
			System.out.print(j + " ");
		}
		
		System.out.println();
	}


System.out.println("----------------------------------------");

for(int i = 1; i<=5; i++) {
	
	for(int j = i; j<=5; j++) {
		
		System.out.print(" ");
	}
		
		for(int k = 1; k<=i; k++) {
			
			System.out.print(k + " ");
		
	}
	
	System.out.println();
}


System.out.println("----------------------------------------");

for(int i = 5; i>=1; i--) {
	
	for(int j =i; j<=i; j++) {
		
		System.out.print(" ");
		
	}
		for(int k=i; k>=1; k--) {
			
			System.out.print(k);
		}
	
	
	System.out.println();
}
}
	
}

