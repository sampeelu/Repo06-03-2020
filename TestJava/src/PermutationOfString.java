
public class PermutationOfString {

	public static void main(String[] args) {

		String str = "sa w";
		int len = str.length();
		System.out.println("permutation are : ");
		permutationString(str,0,len);

	}

	public static String swapStr(String a, int i , int j) {
		char[] b = a.toCharArray();
		char temp;
		temp = b[i];
		b[i] = b[j];
		b[j] = temp;
		return String.valueOf(b);
	}

	public static void permutationString(String str, int start, int end) {

		// print the permutation
		if(start == end-1)
			System.out.println(str);
		else{
			for(int i=start; i<end; i++){

				str = swapStr(str,start , i);
				permutationString(str,start+1,end);
				str = swapStr(str,start , i);

			}
		}

	}

}
