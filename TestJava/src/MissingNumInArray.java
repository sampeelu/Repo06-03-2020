
public class MissingNumInArray {

	public static void main(String[] args) {
		missing();
	}

	public static void missing() {
		int arr[] = {1,2,4,5,6,8};
		int n = arr.length-1;
		int total = (n+1)*(n+2)/2;
		for(int i=0;i<arr.length;i++){
			total = Math.abs(total-arr[i]);

		}
		System.out.println(total);
	}



}
