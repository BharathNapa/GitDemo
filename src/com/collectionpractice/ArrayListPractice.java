package com.collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		
		List <Object> al = new ArrayList <>();
		
		al.add("Bharath");
		
		al.add('N');
		
		al.add("12345");
		
		System.out.println(al);
		
		List <Object> al2 = new ArrayList <>();
		
		al2.addAll(al);
		
		System.out.println(al2);
		
		List <Object> al3 = new ArrayList <>();
		
        al3.add("chennai");
	
		al3.add("Mumbai");
		
		al3.add("HYD");
		
		System.out.println(al3);
		
		al3.add(2, al);
		
		System.out.println(al3);
		
		
		al3.removeAll(al2);
		
		System.out.println(al2);
		
//		al3.removeAll(al);
		
//		
//	    System.out.println(al3);
		
		List<Object> subList = al3.subList(0, 2);
		System.out.println(subList);
		
	
		
//		System.out.println(al.indexOf("12345"));
//		
//		System.out.println(al.get(2));
//		
//		System.out.println(al.size());
//		
//	System.out.println(al.add(27));
//	
//	System.out.println(al);
//	
//	al.add(1, 'B');
//	
//	System.out.println(al);
//	
//	System.out.println(al.contains("Bharath"));
//	
//	al.set(0, "Bararth");
//	
//	
//	
//	al.remove("Bharath");
//			System.out.println(al);
//			
//			System.out.println(al.contains("Bharath"));
//		
//		//al.remove(1);
	}
}
