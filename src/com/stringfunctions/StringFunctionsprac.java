package com.stringfunctions;

public class StringFunctionsprac {
	
	public static void main(String[] args) {
		
		String name = "BHARATH NAPA";
		
		//System.out.println(name);
		
		//Length
		
//		int len = name.length();
//		
//		System.out.println(len);
		
		//equals
		
//		Boolean equ  = name.equals("BHARATH NAPA");
//		
//		System.out.println(equ);
		
		//equals ignore case
		
//		Boolean eic = name.equalsIgnoreCase("Bharath Napa");
//		
//		System.out.println(eic);
		
		//toUppercase
		
//		String upper = name.toUpperCase();
//		
//		System.out.println(upper);
		
		//tolowercase
		
//		String lower = name.toLowerCase();
//		
//		System.out.println(lower);
		
		//endswith
		
//		Boolean ew = name.endsWith("NAPA");
//		
//		System.out.println(ew);
		
		//startswith
		
//		boolean sw = name.startsWith("BHARATH");
//		
//		System.out.println(sw);
		
		//CONTAINS
		
//		boolean c = name.contains("B");
//		
//		System.out.println(c);
		
		//INDEXOF
		
//		int io = name.indexOf("A");
//		
//		System.out.println(io);
		
	  //Last index of
		
//		int lastIndexOf = name.lastIndexOf("A");
//		
//		System.out.println(lastIndexOf);
		
		//char
		
//		char c = name.charAt(8);
//		
//	System.out.println(c);
		
		//replace
//		
//		String rep = name.replace("NAPA", "balaji");
//		System.out.println(rep);
		
		//empty
		
//		Boolean is = name.isEmpty();
//		
//		System.out.println(is);
//		
		
		//trim
		
//		String trim = name.trim();
//		
//		System.out.println(trim);
		
		//SUBSTRING
		
//		String sb = name.substring(5);
//		
//		System.out.println(sb);
		
		String[] split = name.split("N");
		
		for (String x : split) {
			
			System.out.print(x);
			
		}
		
	}

}
