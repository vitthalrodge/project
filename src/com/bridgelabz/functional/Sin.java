package com.bridgelabz.functional;

import java.util.Scanner;

public class Sin {
	 public static void main(String[] args) { 

    Scanner scanner = new Scanner(System.in);
    System.out.println("ENTER THE VALUE OF X");
    int x = scanner.nextInt();
    
 x=  (int) (x%(2 *Math.PI));

double term = 1.0;   
double sum  = 0.0;      

for (int i = 1; term != 0.0; i++) {
    term *= (x / i);
    if (i % 4 == 1) sum += term;
    if (i % 4 == 3) sum -= term;
}
System.out.println(sum);
}
  

}
