

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class IiflArray {

	public static void main(String[] args) {
		int[] arr = {6, 0, 8, 0, 4, 3, 0, 5};

		pushZerosToEnd(arr, 8);
		System.out.println("...........................................................................");
		pushZeroAtStart(arr,arr.length-1);

	}


	static void pushZerosToEnd(int arr[], int n) 
	{ 
		int count = 0;  // Count of non-zero elements 

		// Traverse the array. If element encountered is 
		// non-zero, then replace the element at index 'count' 
		// with this element 
		for (int i = 0; i < n; i++){
			if (arr[i] != 0){ 
				arr[count++] = arr[i]; // here count is 
			}          // incremented 
		}
		// Now all non-zero elements have been shifted to 
		// front and 'count' is set as index of first 0. 
		// Make all elements 0 from count to end. 
		while (count < n) {
			arr[count++] = 0;
		}

		System.out.println(Arrays.toString(arr));
		/*for (int i=0; i<8; i++){ 
			System.out.print(arr[i]+" "); 
		};*/
	} 

	// push zeros at start point
	// Function that pushes all the zeros 
	// to the start and ones to the end of an array 
	static void pushZeroAtStart(int arr[],int n){
		int count = arr.length-1;
		for(int i=arr.length-1;i>=0;i--)
			if (arr[i] != 0)
				arr[count--] = arr[i]; 
				while(count >=0 )
				arr[count--]=0;
				System.out.println(Arrays.toString(arr));
		/*for (int i=0; i<8; i++){ 
			System.out.print(arr[i]+" "); 
		};*/
	}
}
