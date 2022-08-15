package com.programs;

public class Armstrong {
	
	public static void main(String[] args) {
		
		int n = 370, temp, armstrong = 0;
		
		int original = n;
		
		while(n>0) {
			
			temp =  n%10;
	
			temp = (int) Math.pow(temp, 3);
			
			armstrong = armstrong+temp;
			
			n=n/10;
		}
		
		if(original==armstrong) {
			
			System.out.println("Yes");
			
		}else {
			
			System.out.println("No");
		}
	}

}
