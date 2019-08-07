package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {

	public static void main (String args[]) {
	float sum =0;
		Scanner input = new Scanner(System.in);
		Utility utility = new Utility();
		System.out.print("Enter any number");
		int Number = input.nextInt();
		
		
			
		
		Utility.HarmonicNumber(Number);
			input.close();
	}


}


