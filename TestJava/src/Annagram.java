
public class Annagram {

	public static void main(String[] args) {
		anagram("keep","peek");

	}

	// s1 = keep , s2 = peek
	public static void anagram (String s1 , String s2) {
		String emp = "";
		char[] arr = s1.toCharArray();
		for(int i=arr.length-1;i>=0;i--){

			emp = emp+arr[i];
		}
		System.out.println(emp);
		if(emp.equals(s2))
			System.out.println("this is anagram");
		else
			System.out.println("not anagram");

	}
}
