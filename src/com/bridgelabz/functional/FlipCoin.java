package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FlipCoin {
	public static void main(String args[]) {
		
		
		Scanner input = new Scanner(System.in);
		Utility utility = new Utility();
		System.out.print("Enter the number of times to flip The coin");
		int times = input.nextInt();
		
		
		input.close();
		Utility.FlipCoin( times);
		}
}