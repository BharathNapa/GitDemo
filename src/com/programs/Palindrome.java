package com.programs;

public class Palindrome {
	
	
public static void main(String[] args) {
		
		int n = 121, temp, palindrome = 0;
		
		int original = n;
		
		while(n>0) {
			
			temp =  n%10;
			
			palindrome= (palindrome*10)+ temp; 
			
			n=n/10;
		}
		
		if(original==palindrome) {
			
			System.out.println("Yes");
			
		}else {
			
			System.out.println("No");
		}
	}

}



