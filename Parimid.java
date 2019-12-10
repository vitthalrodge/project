package com.ps;

public class Parimid {

	public static void main(String[] args) {
		
					int n = 5, i, j, k;
							int num = 1; 

				k = n - 1; 

				for ( j = 1 ; j <= n ; j++ ) 
				{ 
				num = j; 
				
				for ( i = 1 ; i <= k ; i++ ) 
					System.out.print(" "); 
				
				k --; 
				
				for ( i = 1 ; i <= j ; i++ ) 
				{ 
					System.out.print(num); 
					num++; 
				} 
				num--; 
				num--; 
				for ( i = 1 ; i < j ; i++) 
				{ 
					System.out.print(num); 
					num--; 
				} 
				System.out.println(); 
				} 
			} 
		} 


	


	
