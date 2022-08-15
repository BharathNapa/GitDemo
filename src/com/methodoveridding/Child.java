package com.methodoveridding;

public class Child extends Parent {

	@Override
	public void studentName(String name) {
		super.studentName(name);
	}

	@Override
	public void studentDetails(char initial, int age, String degree) {
		super.studentDetails(initial, age, degree);
	}

	
public static void main(String[] args) {
	
	Child obj = new Child();
	
	obj.studentName("Bharath");
	
	obj.studentDetails('N', 26, "BE");
}
}
