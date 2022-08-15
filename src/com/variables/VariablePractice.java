package com.variables;


 

public class VariablePractice {

int a = 27; // class variable
     
    static int  b = 20; // static variable
     
    public static void studentName() {  //static method
    	
    	int c = 5;
    	
    	System.out.println(c);
    
    }

    		
	public void studentAge() {  //local variable

		int a = 28;
		
		
		System.out.println(a);
		
		
		}
	
public static void main(String[] args) {
		
		VariablePractice vp = new VariablePractice();
		
		vp.studentAge();
		
		System.out.println(b);
		
		studentName();
		
		VariablePractice.VariablePractice1 vp1 = new VariablePractice.VariablePractice1();

	vp1.studentAge();
		
	}

public static class VariablePractice1 {
	
	public void studentAge() {
		
		int d = 20;
		
		System.out.println(d);
	}
	
}
	
	
}


