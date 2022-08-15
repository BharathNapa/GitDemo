package com.polymorphism;

public  class MethodOverloading {
	
	public static void studentDetails(String name) {
		
		System.out.println(name);
	}

	public static  void studentDetails(int age, int age1, String value, String value2) {
		
		System.out.println(age + " "+age1+ " "+ value+"  "+ value2);
		
		
	}
	
	
	public static void main(String[] args) {
		
		studentDetails("Bharath");
		
		studentDetails(26,27,"\" bh","bh2 \"");
		
	}
}
