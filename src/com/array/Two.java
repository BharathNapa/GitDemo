package com.array;

public class Two {
	
	public static void main(String[] args) {
		
		// row by row
		
		int[][] a  = { { 1,2,3,4},{5,6,7,8} };
		
		//System.out.println(a[0][1]);
		
//		for(int i =0; i<2; i++) {
//			
//			for(int j =0; j<4; j++) {
//				
//				System.out.print(a[i][j]);
//			}
//			
//			System.out.println();
//		}
//		
		//column by column
		
		int[][] a1  = { 
				
				{ 1,2,3,4},
				
				 {5,6,7,8} };
		
//		System.out.println(a1[0][0]);
//		System.out.println(a1[1][0]);
//		
//		System.out.println(a1[0][1]);
//		System.out.println(a1[1][1]);
//		
//		System.out.println(a1[0][2]);
//		System.out.println(a1[1][2]);
//		
//		System.out.println(a1[0][3]);
//		System.out.println(a1[1][3]);
		
		for(int i = 0; i<4; i++) {
			
			for(int j = 0; j<2; j++) {
				
				System.out.print(a1[j][i]);
			}
			
			System.out.println();
		}
	}
	


}
