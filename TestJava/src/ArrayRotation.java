import java.util.Arrays;

public class ArrayRotation {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int n=4;
		System.out.print("originoal array : ");
		
		System.out.println(Arrays.toString(arr));
		
		
		for(int i=0;i<n;i++){
			int j,
			last = arr[arr.length-1];

			for(j =arr.length-1;j>0;j--){
				arr[j]=arr[j-1];	
			}
			arr[0]=last;
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr));

		

	}
}


