/******************************************************************************
 
 * Purpose: 
 *
 *  @author  vitthalrodge
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear {
	public static void main(String[] args) {
		
		int year ;
		
		System.out.print("enter year");
		Scanner obj = new Scanner(System.in);
		Utility utility = new Utility ();	
		year = obj.nextInt();
		Utility.leapYear(year);
		obj.close();
		
		
		
		
	}

}
