package test;

import java.util.Arrays;

public class IiflDiagonalEntries {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

		for(int i= 0;i<=arr.length-1;i++){
			for(int j=0;j<=arr.length-1;j++){
				if(i==j||i+j==2){
				int arr1 = arr[i][j];
				System.out.print(arr1);
			}else{
				System.out.print(" ");
			}
		}
			System.out.println();
		}

	}

}
