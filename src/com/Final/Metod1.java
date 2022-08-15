package com.Final;

public class Metod1 extends Method {



	
	@Override
	public void demo() {
	//super.demo();
		
	this.demo1();
	}

	public void demo1() {
		
		System.out.println("Napa");
		
		//this.demo();
	
	}
	
	
	
	public static void main(String[] args) {
		
		Metod1 m1= new Metod1();
		
		m1.demo();
		
	}
}


