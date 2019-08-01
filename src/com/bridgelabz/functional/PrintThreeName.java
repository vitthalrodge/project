
package com.bridgelabz.functional;

public class PrintThreeName {

	public static void main(String[] args) {
	
		{ 
	        String s[] = "Alice Bob Carol".split(" "); 
	        String a = ""; 
	        for (int i = s.length - 1; i >= 0; i--) { 
	            a += s[i] + " "; 
	        } 
	        System.out.print("hi ");
	        
	        System.out.println(  a.substring (0, a.length() - 1)); 
	    } 
	}  
}