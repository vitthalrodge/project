package com.bridgelabz.functional;

import java.util.Scanner;

public class Sin {
	 public static void main(String[] args) { 
int  count = 2,sum=0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("ENTER THE VALUE OF X");
    int x = scanner.nextInt();
    System.out.print(" ENTER THE NUMBER");
    int num= scanner.nextInt();
    
 x=  (int) (x%(2 *Math.PI));
System.out.print( " "+x );

for ( int i = 3; i<=num; i+=2) {
	 int fact=1;
for(int j=i;j>0;j--) {
	
	fact= fact*j;
}

if(count==2) {
sum = (int) (x-(Math.pow(x,i)/fact));
count=0;

}
else if (count==0) {
sum = (int) (sum+(Math.pow(x,i)/fact));
count=1;
}
else if (count==1) {
	sum = (int) (sum-(Math.pow(x,i)/fact));
	count=0;
	}
}
	
    
System.out.println(sum);

  
	 }
}
