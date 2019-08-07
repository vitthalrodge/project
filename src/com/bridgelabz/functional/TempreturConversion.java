package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TempreturConversion {

	

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Utility utility = new Utility();
	System.out.print("Enter Tempreture In Fahrenheit");
	double F = input.nextDouble();
	
 	  input.close();
 	  Utility.TempreturConversion(F);
}  
} 
