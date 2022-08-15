package com.switchkeyword;

public class Switch {
	
	public static void main(String[] args) {
		
		
		int day = 9;
		
		switch(day) {
		
		case 1 :
		
		System.out.println("Monday");
		
		break;
		
		case 2:
			
			System.out.println("Tuesday");
			
			break;
			
		case 3:
			
			System.out.println("Wednsday");
			
			break;
			
		case 4:
			
			System.out.println("Thursday");
		
			break;
			
		case 5:
			
			System.out.println("Friday");
			
			break;
			
			default:
				
				System.out.println("No Match");
		}
		
		
		for(int i = 1; i<10; i++) {
		
		if(i==4) {
			
			break;
			
		
		}
		
		System.out.println(i);
		
	}
		
		for(int i = 1; i<10; i++) {
			
			if(i==4) {
				
				continue;
				
			
			}
			
			System.out.println(i);

}
	
}
}