package com.programs;

public class Fibo {
	
	public static void main(String[] args) {
		
		int n = 10;
		
		int a=1, b=1, c;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i =3; i<=n; i++) {
			
			c=a+b;
			
			System.out.println(c);
			
			a=b;
			b=c;
			
		}
		
	}
	
	
	
	
	
	

}
