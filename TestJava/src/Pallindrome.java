
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "malayalam";
		pall(str);
		
	}

	public static void pall(String str){
		char []arr = str.toCharArray();
		String emp = "";
		for(int i=arr.length-1;i>=0;i--){
			emp = emp+arr[i];
		}
		String str2 = emp;
		if(str2.equals(str))
			System.out.println("pallindrome");
		else
			System.out.println("not");
	}
	
}
