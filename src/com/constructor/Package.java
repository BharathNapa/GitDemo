package com.constructor;

public class Package {
	
	
	public Package() {

		System.out.println("Bharath");

	}
	
	public void package1 (int id) {
		
	System.out.println(id);

}
	
	
	public static void main(String[] args) {
		
	Package p1 = new Package();
	
	Package p = new Package();
	
	
	p.package1(0);
	}

}