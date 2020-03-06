import java.util.Arrays;

public class OddEvenArray {

	public static void main(String[] args) {

		// its wrong
		//saparateOddEven();

		int []arr= {1,2,3,4,5,6};
		seggregrateOddEven(arr);
		System.out.println("..................");
		int n = arr.length; 
		//rearrangeEvenAndOdd(arr, n); 


	}

	public static void saparateOddEven(){
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int arr2[] = new int[arr.length];
		int left=0 ,right = arr.length-1;

		for(int i = 0;i<arr.length;i++){
			if(arr[i]%2==0 && left < right){
				arr2[left] = arr[i];
				left++;
			}
			else
				arr2[right] = arr[i];
			right--;


		}
		System.out.print(Arrays.toString(arr2));


	}


	public static void seggregrateOddEven(int[] arr){

		/* Initialize left and right indexes */
		int left = 0, right = arr.length - 1; 
		while (left < right) 
		{ 
			/* Increment left index while we see 0 at left */
			while (arr[left]%2 == 0 && left < right) 
				left++; 

			/* Decrement right index while we see 1 at right */
			while (arr[right]%2 != 0 && left < right) 
				right--; 

			if (left < right) 
			{ 
				/* Swap arr[left] and arr[right]*/
				int temp = arr[left]; 
				arr[left] = arr[right]; 
				arr[right] = temp; 
				left++; 
				right--; 
			} 
		} 			

		System.out.print("Array after segregation :" + Arrays.toString(arr)); 
		/*for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i]+" ");*/ 
	} 



	static void rearrangeEvenAndOdd(int arr[], int n) 
	{ 
		// variables 
		int j = -1,temp; 

		// quick sort method 
		for (int i = 0; i < n; i++) { 

			// if array of element 
			// is odd then swap 
			if (arr[i] % 2 == 0) { 

				// increment j by one 
				j++; 

				// swap the element 
				temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 

		for (int i = 0; i < n; i++) 
			System.out.print(arr[i] + " "); 
	} 



	// Function to segregate even 
	// odd numbers 
	static void arrayEvenAndOdd( 
			int arr[], int n) 
	{ 

		int i = -1, j = 0; 
		while (j != n) { 
			if (arr[j] % 2 == 0) 
			{ 
				i++; 

				// Swapping even and 
				// odd numbers 
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
			j++; 
		} 

		// Printing segregated array 
		for (int k = 0; k < n; k++) 
			System.out.print(arr[k] + " "); 
	} 

} 
