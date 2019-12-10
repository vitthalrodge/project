package com.ps;

public class Matrix {

	public static void main(String[] args) {		
		int i,j;		
		//int  a[][]= {{1,2,3},{4,5,6},{4,5,6},{1,2,3}};
		int  a[][]= {{1,2,3},{4,5,6},{4,5,6},{3,2,5}};
		int b[][]=new int[3][3];
		int c[][] = new int [3][2];
		int d[][]=new int[2][2];
		int e[][]= new int [2][1];
		for(i=0;i<3;i++)
		{
			if(i==0) 
			{
				for (j=0;j<3;j++)
				{			       	
			      b[i][j]=a[i][j]+a[i+1][j];		
				}			
				System.out.print(b[i][0]+" "+b[i][1]+" "+b[i][2]);	
				System.out.println();
			}
			if(i!=0) 
			{	
			b[i][0]=a[i+1][0];
			b[i][1]=a[i+1][1];
			b[i][2]=a[i+1][2];			
			System.out.print(b[i][0]+" "+b[i][1]+" "+b[i][2]);	
			System.out.println();
			}
		}	
		System.out.println();
		System.out.println();
		for(i=0;i<3;i++)
		{
			if(i==0) 
			{
				for(j=0;j<3;j++)
				{
					c[j][0]=b[j][1]-b[j][0];
					System.out.print(c[j][0] + " ");	
					c[j][1]=b[j][2];
					System.out.print(c[j][1]);	
				    System.out.println();					
				}				
			}			
		}
		System.out.println();
		System.out.println();
		for(i=0;i<3;i++)
		{
			if(i==0) 
				{	
					d[i][0]=c[i][0];
					d[i][1]=c[i][1];
					
					System.out.print(d[i][0]+" "+d[i][1]+" ");	
					System.out.println();
				}
			if(i==1) 
			{
				for (j=0;j<2;j++)
				{			       	
			      d[i][j]=c[i][j]+c[i+1][j];		
				}			
				System.out.print(d[i][0]+" "+d[i][1]+" ");	
				System.out.println();
			}
			
		}
		System.out.println();
		System.out.println();
		i=0;
		e[i][0]=d[i][0]-d[i][1];
		System.out.print(e[i][0] + " ");
		System.out.println();	
		e[i+1][0]=d[i+1][0]-d[i+1][1];
		System.out.print(e[i+1][0]);
		System.out.println();
		System.out.println();
		int output = e[0][0]+e[1][0];
		
		System.out.print(output);
			
						
		
	}
}
