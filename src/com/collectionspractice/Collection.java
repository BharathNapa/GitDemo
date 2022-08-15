package com.collectionspractice;

import java.util.Arrays;
import java.util.Comparator;

public class Collection {
	
	
	public static void main(String[] args) {
		
		
		int a [] = {18,17,92,78};
		
		Arrays.sort(a);
		
	   for(int i : a) {
		   
		   System.out.println(i);
	   }
		
	   
	   String [] s = {"Bharath","mani","deepak","priya"};
	   
	   Arrays.sort(s);
	   
	   for(String i : s) {
		   
		   System.out.println(i);
	   }
	   
	   Comparator com = new Comparator_Demo();
	   
	   Arrays.sort(s, com);
	  
	   
	   for(String i : s) {
		   
		   System.out.println(i);
	}

}
	
}
