package com.exceptions;

public class Throws {

	
	private void divide() throws Exception, Throwable {

int a= 10;
		
		int b = 0;
		
		try {
		
		System.out.println(a/b);
		
		
	}catch(Exception e) {
		
		//e.printStackTrace();
		
		throw new Exception("mmm");
		
	}
	
	}
	public static void main(String[] args) throws Throwable {
		
		Throws t = new Throws();
		
		t.divide();
	}
	
	
	
	
}
