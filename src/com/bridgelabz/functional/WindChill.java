package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class WindChill {
	public static void main(String args[]) {

		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		
		
		
	//	if (t > 50 || v > 120 || v < 3) 
		//{
			 
	         	System.out.println("Tempreture"+t);
	         	
	          	System.out.println("Speed"+v);
	          	
		       
			
	
		//}
		
		//else {
			//System.out.println("wrong input");
			Utility.WindChill(t,v);
	//	}
		}
}