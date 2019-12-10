package com.ps;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k;
		int i,j;
		int n=1;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=9;j++)
			
			{
				
				if(j>=6-i&&j<=4+i)
				{
				 
				 	 
					System.out.print(n);
					n++;
				
					
				}
				System.out.print("  ");
				}
			System.out.println();	
			}
		
		
		
		
	}

}
