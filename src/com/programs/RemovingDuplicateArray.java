package com.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicateArray {
	
	public static void main(String[] args) {
		
		Integer a [] = {10,20,30,10,20,50};
		
		List<Integer> l = Arrays.asList(a);
		
		Set<Integer> s = new HashSet<>(l);
		
		
		System.out.println(s);
		
	}
	
	

}
