package com.ps;

public class StringCount {

	public static void main(String[] args) {
	
// TODO Auto-generated method stub
 String str="aaaaabbbbbcccc";
 int n=str.length();
 
 for(int i=0;i<n;i++)
 {
	 
	 
	 
	 int count=0;
	 while(i<n-1&&str.charAt(i)==str.charAt(i+1))
	{
		
		count++;
	
	 i++;
	 }
	System.out.print(str.charAt(i));
	 
	System.out.print(count);
	 } 
 }
	

}
