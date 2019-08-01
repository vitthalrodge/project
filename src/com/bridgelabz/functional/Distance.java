
package com.bridgelabz.functional;

public class Distance {

	public static void main(String[] args) {
		long x,y;
		 
		double dis;
 
                x=Long.parseLong(args[0]);
		
                y=Long.parseLong(args[1]);
 
	       
		     
	        dis=Math.sqrt((x)*(x) + (y)*(y));
 	 	        
  	        System.out.println("distancebetween"+"("+x+","+y+"=>)"+dis);
 
	}




}

