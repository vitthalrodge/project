/******************************************************************************
 
 * Purpose: Determines whether or not n is prime.
 *
 *  @author  vitthalrodge
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/ 


package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility
{

/**
 * @param year
 * @return
 */

public static int leapYear(int year)
{
	if(year>1582)
	{
	if(year%400==0)
	{

		System.out.print("YEAR IS LEAP YEAR" );
		
	}
	else if (year%100==0)

	{
		System.out.print("YEAR IS NOT LEAP YEAR" );
	}
	else if (year%4==0)
	{
		System.out.print("YEAR IS LEAP YEAR" );
	}
	else 
	{
		System.out.print("YEAR IS NOT LEAP YEAR");
	}	
	}
	else 
	{
		System.out.print("INVALID YEAR");
	}
	return year;
}

/**
 * @param num1=first ineger;
 * @param num2= second ineteger;
 * @param num3 = third integer;
 */
public static void IntOpt(int num1, int num2, int num3) {
	
	


int result1=num1+num2*num3;
int result2=num1*num2+num3;
int result3=num1+num2/num3;
int result4=num1%num2+num3;

System.out.println("The result  is "+result1);
System.out.println("The result  is "+result2);
System.out.println("The result  is "+result3);
System.out.println("The result  is "+result4);

}

/**
 * @param a = enter the value ;
 * @param b = enter the value of b;
 * @param c = enter the value of c;
 */
public static void Quadratic(double a, double b, double c) {
	 double d = b * b - 4 * a * c;
	 double r1=0,r2=0;
	    if (d > 0){

	     
	       r1 = (-b + sqrt(d)) / (2 * a);
	         r2 = (-b - sqrt(d)) / (2 * a);

	        System.out.println("The equation has two real roots " + r1 + " and " + r2);
	    }


	    if (d == 0)
	    {
	        System.out.println("The equation has one root " +r1);

	        r1 = -b/(2 * a);
	        r2 = -b/(2 * a);

	    }

	    if (d < 0){
	        System.out.println("The equation has no real root");
	
}
}

private static double sqrt(double d) {
	// TODO Auto-generated method stub
	return 0;
}

}

