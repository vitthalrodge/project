package com.bridgelabz.functional;

public class j {
	  // Driver method to test the above function 
    public static void main(String[] args) 
    { 
        int arr[] = new int[]{1, 5, 3, 19, 18, 25}; 
        System.out.println("Minimum difference is ");
        int diff = Integer.MAX_VALUE; 
        
        // Find the min diff by comparing difference 
        // of all possible pairs in given array 
        for (int i=0; i<=arr.length; i++) 
            for (int j=i+1; j<arr.length; j++) 
                if (Math.abs((arr[i] - arr[j]))<diff)
                    diff = Math.abs((arr[i] - arr[j])); 
      System.out.print(diff);
       
      
    } 
      
    


}
