package com.stringtypes;

public class Immutable {
	
	public static void main(String[] args) {
		
		String name1 = "Bharath";
	
		System.out.println(System.identityHashCode(name1));
		
		String name2 = "Bharath";
		
		System.out.println(System.identityHashCode(name2));
		
		System.out.println(System.identityHashCode(name1+name2));
		
		
		String s = "sachin";
		
		s = s.concat("Tendukar");
		
		System.out.println(s);
		
		
		
	}

}
