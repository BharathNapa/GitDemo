package com.programs;

public class PrimeNumber1 {
	
	public static void main(String[] args) {
		
		 int n =9;
			
		 boolean flag = true;
		 
			for(int i=2; i<n; i++) {
				
				
				
				if(n%i==0) {
					
					flag = false;
					
					//System.out.println(flag);
				}
				
				
			}
				
			
    
	if(flag == true) {
		
		System.out.println("Prime");
		
	}else {
		
		System.out.println("Not a prime");
	

}
}
}