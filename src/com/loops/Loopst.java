package com.loops;

import java.util.Scanner;

public class Loopst {
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter no of rows :-");
//		
//		int rows = sc.nextInt();
//		
//		for (int i =1; i<=rows; i++) {
//			
//			for(int k=rows; k>=i; k--) {
//				
//				System.out.print(" ");
//			}
//			
//			for(int j = 1; j<=i; j++) {
//				
//				System.out.print(j + " ");
//				
//			}
//			
//			System.out.println();
//		}
//		
		for(int i = 1; i<=5; i++){
			
			for(int j = i; j<=5; j++){
				
				System.out.print(" ");
			}
				
				for(int k = 1; k<=i; k++) {
					
					System.out.print(k + " ");
				
			}
			
			System.out.println();
		}
		
		for(int i = 5; i>=1; i--) {
			
			for(int j = 5-i; j>=0; j--) {
				
				System.out.print(" ");
			}
				for(int k=1; k<=i-1; k++) {
					
					System.out.print(k+" ");
				}
				
				System.out.println();
			}
			
			
		}
		
		
	}
	



