package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice {
	
	public static void main(String[] args) {
		
		Map <Integer,String> s1 = new HashMap <Integer,String> ();
		
		s1.put(12, "Java");
		
		s1.put(13, "C++");
		
		s1.put(14, "Python");
		
		s1.put(15, "Python");
		
		s1.put(16, "SQL");
		
		System.out.println(s1);
		
		int size = s1.size();
		
		System.out.println(size);
		
		String string = s1.get(12);
		
		System.out.println(string);
		
		Set<Entry<Integer, String>> entrySet = s1.entrySet();
		
		System.out.println(entrySet);
		
	Set<Integer> keySet = s1.keySet();
	
	System.out.println(keySet);
	
	Collection<String> values = s1.values();
	
	System.out.println(values);
	
	boolean containsValue = s1.containsValue("Java");
	
	System.out.println(containsValue);
	
	boolean containsKey = s1.containsKey(12);
	
	System.out.println(containsKey);
	}

}
