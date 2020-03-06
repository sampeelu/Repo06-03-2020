package binarySearch;

public class Binary {
	public static void main(String[] args) {
		Binary ob= new Binary();
		int[] array = {10,23,30,45,88,132,567,888};
		int x = 567;
		int length = array.length;
		int index = ob.binarySearch(array,0,length-1, x);

		//		int index = ob.binarySearchItr(array, x);
		//		its giving wrong index
		if(index==-1){
			System.out.println("element is not in array");
		}else{
			System.out.println("element is present at index "+index);
		}
	}

	public int binarySearch(int[] arr, int f,int l,int x){
		if(l>=1){
			int mid = f+(l-f)/2;
			//match with middle point
			if(arr[mid]==x)
				return mid;
			// element is greater than middle
			if(x>arr[mid])
				return binarySearch(arr,mid+1,l,x);
			// element is less than middle
			if(x<arr[mid])
				return binarySearch(arr,f,mid-1,x);
		}
		return -1;
	}
	public int binarySearchItr(int[] arr,int x){
		int f = 0;
		int l = arr.length;
		while(l>=f){
			int mid = f+(l-f)/2;
			// if middle is equal to x
			if(arr[mid]==x){
				return mid;
			}else if(arr[mid]<x){
				return f= mid+1;
				
			}else{
				l = mid-1;
			}
		}
		return -1;

	}
}