package com.bridgelabz.functional;

import java.util.Scanner;

public class PrimeFactor {
public static void main(String args[]) {
	int i;
Scanner scanner = new Scanner(System.in);
System.out.println("ENTER THE NUMBER");
 int number = scanner.nextInt();
 for (i=2;i<number;i++) {
	 while(number%i==0) {
		 
		 System.out.print(i+" ");
		 number=number/i;
 }


}
 if(number>2) {
	 System.out.println(number);
 
 }
}
}

