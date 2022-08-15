package com.programs;

import java.util.Arrays;
import java.util.Collections;

public class Arrays_Descending {
	
	public static void main(String[] args) {
		
	//Integer a [] = { 20, 50,30,60};
		
		String  a [] = {"Bharath","mani","deepak","priya"};
		
		Arrays.sort(a, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(a));
		
	}
	
	

}
