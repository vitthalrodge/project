package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DayOfWeak {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		System.out.println("ENTER THE DAY");
		int day = scanner.nextInt();
		System.out.println("ENTER THE MONTH");
		int month = scanner.nextInt();
	System.out.println("ENTER THE YEAR");
	int year = scanner.nextInt();

scanner.close();
utility.DayaOfWeak(day,month,year);
       }
	}
