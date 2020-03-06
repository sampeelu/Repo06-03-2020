package binarySearch;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {1,2,4,6,9,10,11,12};
		//binary(arr);

		indexBasedOnBinary(arr,11);

	}

	public static void binary(int arr[]){
		int item = 9;
		int li = 0;
		int hi = arr.length-1; 
		int mi = (li+hi)/2;
		while(li<=hi){
			if(arr[mi]==item){
				System.out.println("item is at position :"+mi);
				break;
			}
			else if(arr[mi]<item){
				li = mi+1;
			}
			else{
				hi=mi-1;
			}
			mi = (li+hi)/2;

		}
		if(li>hi){
			System.out.println("not present");
		}



	}

	/**
	 * 
	 * binary search for practice
	 */


	public static void indexBasedOnBinary(int[] arr, int element) {
		int li = 0;
		int hi = arr.length-1;
		int mi = (li+hi)/2;

		while(li<=hi){

			if(arr[mi]>element)				
				hi = mi-1;				

			else if (arr[mi]<element)
				li = mi+1;
			else{
				System.out.println("element present on this index :"+mi);
				break;
			}

			mi = (li+hi)/2;
		}
	}




}





