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



private static final int F = 0;
private static final float Number = 0;

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

/**
 * Purpose : This Program How To Calculate Distance Of Two Point
 * @param x =enter the value of x;
 * @param y = enter the value of y;
 */
public static void Distance(int x, int y) {

double dis =  Math.sqrt((x)*(x) + (y)*(y));
  
  System.out.println("distancebetween"+"("+x+","+y+"=>)"+dis);


}

/**
 * Purpose :SUM OF TWI DICE That Prints The Sum Of two random integers
            :Between 1 And 6 (such as you might Get when rolling dice).
 * @param dice1
 * @param dice2
 */
public void sumoftwodice(int dice1, int dice2) {
	 dice1 = 1 + (int) (Math.random() * 6);                       
	 dice2 = 1 + (int) (Math.random() * 6);                      
	int sum = dice1+ dice2;   
	System.out.println(dice1);
	System.out.println(dice2); 
	System.out.println(sum);
	
}

public static void WindChill(double t, double v) {
	
	double w = 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16 );
	System.out.println("Windchill"+w);
}

public static void TempreturConversion(double f) {
	
	double C= (F - 32)* 5/9 ;
	
	
	System.out.print("Tempreture In Celsius"+C);
}

/**
 * @param sum
 * @return 
 */
public static void HarmonicNumber(int  Number) {
	
     float sum = 0;
	for (float  i = 1;i<=Number;i++)
	{

		sum  =(sum +(float)(1/i));

	
		System.out.println("THE HARMONIC NUMER IS\n"+sum);
			
       }
     }

/*********************************************************************************
 * Purpose         : Write a program DayOfWeek.java that takes a date as input and prints the day of
the week that date falls on. Your program should take three command­line
arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February,
and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth.
Use the following formulas, for the  calendar (where / denotes integer
division):
y1 = y − (14 − m ) / 12
x = y1 + y 0 /4 − y1 /100 + y1/400
m1 = m + 12 × ((14 − m ) / 12) − 2
d1 = ( d + x + 31 m1/ 12)% 7 
 * @param d(day)   :ENTER THE DAY;
 * @param m(month) :ENTER THE MONTH;
 * @param y(year)  :ENTER THE YEAR;
 *********************************************************************************/
public void DayaOfWeak(int d, int m, int y) {
	// TODO Auto-generated method stub
	
	int y1,m1,x,d1;
    y1 = y-(14-m ) / 12;
	x = y1 + y1 /4-y1 /100 + y1 /400;
	m1 = m + 12 *((14-m )/ 12)-2;
	d1 = ( d + x + 31*m1/12) % 7;

	if (d1==0)
	{
		System.out.println("THE DAY IS SUNDAY");
	}
		
	else if ( d1==1)
	{
		System.out.println("THE DAY IS MONDAY");
	}
		else if (d1==2) {
			System.out.println("THE DAY IS THUESDAY");
		}
		else if(d1==3) {
	System.out.println("THE DAY IS WEDNESDAY");
	}
else if(d1==4) {
System.out.println("THE DAY IS THRUSDAY");
}
else if(d1==5) {
System.out.println("THE DAY IS FRIDAY");
}

else if(d1==6) {
System.out.println("THE DAY IS SATURDAY");
}

}

/**
 * @param times
 */
public static void FlipCoin(int times) {
	
	
	
	double heads = 0;
	for (int i = 0; i <=times; i++) {
		if (Math.random() > 0.5) {
			heads++;
			System.out.print("The Percentage of Heads is" +(float)(heads/times)*100);

            System.out.print("The Percentage of Tail is"+(float)(times-heads)/times*100);	
		}
		}
	
	
	
	
	
}

public static void PoewrOf2(int power) {
	// TODO Auto-generated method stub
	
	int val = 1;
	for (int i = 1; i <= power; i++) {
		val = val * 2;
		System.out.println(val);
	}
	
}













}

