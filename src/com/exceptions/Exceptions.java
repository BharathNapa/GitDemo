package com.exceptions;

public class Exceptions {

	public void divide() {


		int a= 10;
		
		int b = 0;
		
		try {
			
			System.out.println(a/b);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
			System.exit(0);
		}finally {
			
			System.out.println("nnn");
		}
			
	}

	
	public static void main(String[] args) {
		
	Exceptions ex = new Exceptions();
	
	ex.divide();
	}
}
