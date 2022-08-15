package com.collectionspractice;

import java.util.Comparator;

public class Comparator_Demo implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String string1 = o1.toString();
		
		String string2 = o2.toString();
		
		//int result = string1.compareTo(string2);
		
		if(string1.length()>string2.length()) {
			 return -1;
			
		}else if(string1.length()<string2.length()) {
			
			return +1;
		}else {
			
			return 0;
			
		}
		
	}

}
