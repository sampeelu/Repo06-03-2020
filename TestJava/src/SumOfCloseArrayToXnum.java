// Java program to find pair with sum closest to x 
import java.io.*; 
import java.util.*; 
import java.lang.Math; 

public class SumOfCloseArrayToXnum { 
	
	public static void main(String[] args) 
	{ 
		int arr[] = {-40,-5,1,3,6,7,8,20}, x = 5; 
		int n = arr.length; 
		printClosest(arr, n, x);		 
	}
	
	// Prints the pair with sum cloest to x 
	public static void printClosest(int arr[], int n, int x) 
	{ 
		int res_l=0, res_r=0; // To store indexes of result pair 

		// Initialize left and right indexes and difference between 
		// pair sum and x 
		int l = 0, r = n-1, diff = Integer.MAX_VALUE; 

		System.out.println(diff);
		// While there are elements between l and r 
		while (r > l) 
		{ 
			// Check if this pair is closer than the closest pair so far 
			if (Math.abs(arr[l] + arr[r] - x) < diff) 
			{ 
			res_l = l; 
			res_r = r; 
			diff = Math.abs(arr[l] + arr[r] - x); 
			} 

			// If this pair has more sum, move to smaller values. 
			if (arr[l] + arr[r] > x) 
			r--; 
			else // Move to larger values 
			l++; 
		} 

	System.out.println(" The closest pair is "+arr[res_l]+" and "+ arr[res_r]); 
} 
	
	
	// Driver program to test above function 
	 
} 
/*This code is contributed by Devesh Agrawal*/
