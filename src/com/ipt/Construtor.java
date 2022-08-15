package com.ipt;

public class Construtor {
	
	public Construtor () {
		
		this(20);
		
		System.out.println("default constructor");
	}
	
	public Construtor (int age) {
		
		this("Bharath");
		
		System.out.println("The age is :-" + age);
	}

public Construtor (String name) {
		
		System.out.println("The name is :-" + name);
	}
	
		
public static void main(String[] args) {
	
	
	Construtor c = new Construtor(10);
	 

	
}
	
	
	
	
	

}
