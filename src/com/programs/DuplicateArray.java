package com.programs;

public class DuplicateArray {
	
	public static void main(String[] args) {
		
		int a [] = {20,10,30,20,40,10,10,20};
		
		for(int i = 0; i<7; i++) {
			
			for(int j = i+1; j<7; j++) {
				
				if(a[i] == a[j]) {
					
					System.out.println(a[i]);
				}
			}
		}
		
		
	}

}
