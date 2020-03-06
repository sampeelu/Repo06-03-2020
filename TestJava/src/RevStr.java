import java.util.Arrays;

public class RevStr {

	public static void main(String[] args) {
		String str = "every day is my day";
		String str1[] = str.split(" ");
		String temp = "";
		for(int i=str1.length-1;i>=0;i--){
			temp = temp+str1[i]+" ";
		}
		System.out.println(temp);

	}

}
