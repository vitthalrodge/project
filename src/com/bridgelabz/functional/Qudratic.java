package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Qudratic {
	
public static void main(String args [])
{
	System.out.println("Enter the values of a, b and c");
	Scanner scanner = new Scanner(System.in);
	 Utility utility= new Utility();
   

    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();

    

Utility.Quadratic(a,b,c);
 scanner.close();
    }
}


	
	
	
	
	

