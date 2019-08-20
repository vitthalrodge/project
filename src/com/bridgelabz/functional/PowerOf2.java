package com.bridgelabz.functional;

import java.util.Scanner;

public class PowerOf2 {
public static void main (String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter to find power of 2 less than 32");
	int pow = scanner.nextInt();
	int val = 1;
	for (int i = 1; i <= pow; i++) {
		val = val * 2;
		System.out.println(val);
	
		while (pow > 31) {
		System.out.println("invalid input ");
		System.out.println("enter value less than 32");
		pow = scanner.nextInt();
		scanner.close();
	}
	}	
}
}
