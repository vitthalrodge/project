package com.bridgelabz.functional;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
System.out.println("ENTER THE VALUE OF c");
double c = scanner.nextDouble();
 double epsilon = 1e-15;

double  t= c;
while (Math.abs(t-c/t)>epsilon*t) {
	 t = (c/t + t) / 2.0;
}
	 System.out.println(t);
}
	

	
}
