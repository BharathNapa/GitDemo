package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
	
	public static void main(String[] args) {
		
		List <Object> s1 = new ArrayList <Object>();
		
		s1.add(12);
		
		s1.add(5.9);
		
		s1.add("Bharath");
		
		s1.add('N');
		 
		s1.add("Male");
		
		System.out.println(s1);
		
		int s = s1.size();
		
		System.out.println(s);
				
		Object obj = s1.get(4);
		
		System.out.println(obj);
		
	
//		s1.set(2, "malathy");
//		
//		System.out.println(s1);
		
//		s1.remove(2);
//		
//		System.out.println(s1);
		
		int indexOf = s1.indexOf(12);
		
		System.out.println(indexOf);
		
		boolean contains = s1.contains("Bharath");
		
		System.out.println(contains);
		
List <Object> s2 = new ArrayList <Object>();
		
		s2.add(15);
		
		s2.add(5.9);
		
		s2.add("Kamal");
		
		s2.add('h');
		 
		s2.add("Male");
		
		s2.clear();
		
		System.out.println(s2);
		
		//System.out.println(s2);
		
//		s1.add(s2);
//		
//		System.out.println(s1);
		
//		s1.removeAll(s2);
//		
//		System.out.println(s1);
		
		s1.retainAll(s2);
		System.out.println(s1);
		
		
	}
	
	
	

}
