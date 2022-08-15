package com.collectionspractice;

import java.util.Arrays;

public class Collectionequals {
	
	public static void main(String[] args) {
		
		
		int a1 [] = {10,20,30};
		
		int a2 [] = {10,20,30};
		
		
		
		boolean same = true;
		
		for(int i = 0; i<a1.length; i++) {
			
			//for(int j = 0; j<a2.length; i++) {
				
				if(a1[i]!=a2[i]) {
					
					same = false;
					
					//System.out.println(i);
				}
				
				
			}	
	
		
		
		if(same==true) {
			
			System.out.println("equals");
		} else {
			
			System.out.println("Not equals");
		}
		
		System.out.println(Arrays.equals(a1, a2));
		
		Arrays.sort(a2);
		
//		for(int i = 0; i<a2.length; i++) {
//			
//			System.out.println(a2[i]);
//		}
		
		for(int i : a2) {
			
			System.out.println(i);
			
			
		}
		
		
	}
	
	String a [] = {"Bharath","mani","deepak","priya"};
	
}