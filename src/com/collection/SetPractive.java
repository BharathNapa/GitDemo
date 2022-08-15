package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetPractive {
	
	public static void main(String[] args) {
		
		Set<Object> s1 = new LinkedHashSet <Object>();
		
       s1.add(12);
		
		s1.add(5.9);
		
		s1.add("Bharath");
		
		s1.add('N');
		 
		s1.add("Male");
		
       System.out.println(s1);
//		
//		int size = s1.size();
//		
//		System.out.println(size);
//		
//		boolean contains = s1.contains('N');
//		
//		System.out.println(contains);
//		
////		s1.clear();
////		
////		System.out.println(s1);
//		
//		boolean empty = s1.isEmpty();
//		
//		System.out.println(empty);
		
Set <Object> s2 = new LinkedHashSet <Object>();
		
		s2.add(15);
		
		s2.add(5.9);
		
		s2.add("Kamal");
		
		s2.add('h');
		 
		s2.add("Male");
		
//		s2.clear();
//		
   
		System.out.println(s2);
//		
//		s1.addAll(s2);
//		System.out.println(s1);
		
		
		s1.removeAll(s2);
		System.out.println(s1);
		
//		s1.retainAll(s2);
//		System.out.println(s1);
		
		
	}

}
