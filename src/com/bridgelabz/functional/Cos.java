package com.bridgelabz.functional;

public class Cos {
	public static void main(String [] args) {
		int i,s,n=1;
	
		for(i=1;i<=5;i++){ 
			
			for( int k=1;k>=i;k--) {
				System.out.print(" ");
			}
			for(s=1;s<=i;s++) {
		
			 
			System.out.print("  "+s);
		}
			System.out.println();
		}	}
}

