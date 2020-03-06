import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StringReverse {
	
public static void main(String args[]) {
	pattern();
	bubbleShort();
String s1 = "peelu";
String s2= "jain";

String s3 = "";
//System.out.println(s1.compareTo(s3));

//System.out.println(s1.substring(0,1));
s1 = s1+s2;
s2 = s1.substring(0,s1.length()-s2.length());
s1= s1.substring(s2.length());
//System.out.println(s1+" "+s2);
	/*int arr[] = {4,2,6,1};
	Arrays.sort(arr);
	for(int i : arr){
		
		System.out.println(i);
	}
	*/
	}


public static void pattern(){

int[][] arr = new int[2][2];
arr[0][0] = 1;
arr[0][1] = 2;
arr[1][0] = 3;
arr[1][1] = 4;
print(arr);

int arr2[][] = new int[2][2];
arr2[0][0] = 5;
arr2[0][1] = 6;
arr2[1][0] = 7;
arr2[1][1]  =8;
print(arr2);
System.out.println(".......................................................................");
int arr3[][] = new int[2][2];
arr3[0][0] = arr[0][0]+arr2[0][0];
arr3[0][1] = arr[0][1]+arr2[0][1];
arr3[1][0] = arr[1][0]+arr2[1][0];
arr3[1][1]  =arr[1][1]+arr2[1][1];
print(arr3);
}

public static void print(int[][] arr){
	for(int i = 0;i<=arr.length-1;i++){
		for(int j = 0;j<=arr[i].length-1;j++){
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}

public static void bubbleShort(){
	int arr[] = {3,6,1,0,9,11,11};
	for(int i=0;i<=arr.length-1;i++){
		for(int j = i+1;j<=arr.length-1;j++){
			if(arr[i]>arr[j]){
				int temp = arr[i];
				arr[j] = arr[i];
				arr[i] = temp;
				
			}
		}
	}
///	System.out.println(Arrays.toArray(arr);
/*	System.out.println(arr[arr.length-1]);
	System.out.println(arr[arr.length-2]);
	System.out.println(arr[arr.length-3]);*/
}


}