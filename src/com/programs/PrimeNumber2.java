package com.programs;

public class PrimeNumber2 {
	
	
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 1; i<=8; i++) {
			
			//boolean flag = true;
			
			int nod = 0;
			
			for(int j=2; j<i; j++) {
				
				if(i%j ==0) {
					
					//flag = false;
					
					nod++;
					
					System.out.println("value =" + nod);
				}
			}
			
			
			if(nod == 0) {
				
				System.out.println(i +  "is prime number");
				count++;
			}
		}
		System.out.println("total no of counts" + count);

	}

}
