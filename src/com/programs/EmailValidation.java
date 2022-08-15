package com.programs;

public class EmailValidation {
	
	public static void main(String[] args) {
		
		
		
		String s1 = "napa_bharath@gmail.com";
		
		char s2 = '_';
		
		char s3 = '@';
		
		char s4 = '.';
		
		int b = 0;
		
		int length = s1.length();
		
		for(int i =0; i<length; i++) {
			
			char ch = s1.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				
			}else if(Character.isLowerCase(ch)) {
				
			}else if(Character.isDigit(ch)) {
				
			}else if (s2 == ch) {
				
			}else if(s3 == ch) {
				
			}else if(s4 == ch) {
		
			} else {
				
				b++;
			}
	
		
	}
	
	if(b!=0) {
		
		System.out.println("False");
	}else {
		
		System.out.println("True");
	}
	
	

}
}