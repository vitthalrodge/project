package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class IntOpt {
	public static void main(String args[])
	{
		int num1,num2,num3;
		System.out.println("Enter any 3 integers ");
		Utility utility = new Utility ();	
		Scanner obj = new Scanner(System.in);
		num1 = obj.nextInt();
		num2 = obj.nextInt();
		num3 = obj.nextInt();
		
		Utility.IntOpt(num1,num2,num3);
	obj.close();
	}
	
}



