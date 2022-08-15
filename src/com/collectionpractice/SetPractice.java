package com.collectionpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import javax.naming.ldap.SortControl;

import com.collectionspractice.Collection;

public class SetPractice {
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
         ts.add(20);
         
		
         ts.add(100);
		
         ts.add(50);
		
         ts.add(90);
		
         ts.add(100);
         
         System.out.println(ts);
		
		
//		ArrayList al = new ArrayList();
//		
//		al.add(20);
//		
//		al.add(100);
//		
//		al.add(10);
//		
//		al.add(90);
//		
//		al.add(100);
//		
//		System.out.println(al);
//		
//		LinkedHashSet ls = new LinkedHashSet<>(al);
//		
//		System.out.println(ls);
//		
//		Object[] ar = ls.toArray();
//		
//		for(Object a :ar) {
//			
//			System.out.println(a);
//		}
//		
//		Arrays.sort(ar, Collections.reverseOrder());
//		
//		System.out.println(Arrays.toString(ar));
	}

}
