package com.bridgelabz.functional;

public class Trig {
	public static void main(String[] args) {

	
	 double degrees1 = 45.0; 
    double   degrees2 =60.0;
		 
      double radians = Math.toRadians(degrees1); 
	  double radians1 = Math.toRadians(degrees2); 
	 
	     double sinValue  = Math.sin(radians); 
	     double cosValue = Math.cos(radians1); 
	     
	      System.out.println("sin(" + degrees1 + ") = " + sinValue);
	      System.out.println("cos(" + degrees2 + ") = " + cosValue); 
	    } 

	}