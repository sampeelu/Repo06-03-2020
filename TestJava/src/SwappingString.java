
public class SwappingString {

	public static void main(String[] args) {
		String a = "peelu";
		String b = "jain";
		//swappingstr(a,b);
		swapString(a,b);
	}
	
	public static void swappingstr(String a,String b){
		a = a+b;
		System.out.println(a); // peelujain
		b = a.substring(0,a.length()-b.length());
		System.out.println(b); // peelu
		a = a.substring(b.length());
		System.out.println("a is :"+a);

	}
	
	/*
	 * substring practise 
	 */
	
	public static void swapString(String s1, String s2){
		s1 = s1+s2;
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println(s1+" : "+s2);
	}

}
