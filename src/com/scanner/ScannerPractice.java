package com.scanner;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ScannerPractice {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
//		System.out.println("Enter your name :-");
//		
//		String nl = s.nextLine();
//		
//		System.out.println("Your name is :- " + nl);
//		
       System.out.println("Enter your age :- ");
	
       int i = s.nextInt();
	
       System.out.println("Your age is :- " + i);
//		
//		System.out.println("Enter your height :- ");
//		
//		double d = s.nextDouble();
//		
//		System.out.println("Your height is :- " + d);
//		
//		System.out.println("Enter your initial tou yours last name :- ");
//		
//		char c = s.next().charAt(0);
//		
//		System.out.println("Yours last name initial is :-" + c);
		
//		System.out.println("Enter your gender ;- ");
//		
//		String  n = s.next();
//		
//		System.out.println("Your gender is :- " + n);
		
		System.out.println("Your are above 18? ");
		
		boolean b = s.nextBoolean();
		
		if(b==true) {
		
System.out.println("Yes I am over 18");

		}

		else if (b==false) {
	    	
	    	System.out.println("I am not over 18");
		
		
	}
}
	
}
