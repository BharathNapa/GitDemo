package com.collectionpractice;

import java.util.HashMap;

public class Program  {
	
	
	public static void main(String[] args) {
		
		Mobile m1 = new Mobile("Samsung",8,1000);
		
		Mobile m2 = new Mobile("vivo",8,1000);
		
		Mobile m3 = new Mobile("oppo",8,1000);
		
		
		HashMap hm = new HashMap();
		
		hm.put(1, m1);
		
		hm.put(2,m2);
		
		hm.put(3, m3);
		
		
		System.out.println(hm);
		
		
		
	}

}
