import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

class TestingConceptsA {
	static int lcmPractise;
	public static void main(String args[]) {
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number.");
		long n1 = sc.nextLong();
		System.out.println("Enter 2nd number.");
		long n2 = sc.nextLong();*/
		/*long n1 = 35;
		long n2 = 20;
		long lcmOutput = lcm(35,20);
		System.out.println("LCM of "+n1+" and "+n2+" is "+lcmOutput);
	*/
		
		int n1 = 35;
		int n2 = 20;
		int lcmOutput = lcmPractise(35,20);
		System.out.println("LCM of "+n1+" and "+n2+" is "+lcmOutput);
	
	
	/*	int i =1;
		int sum = 0;
	while(i<=100){
			
			sum = sum +i*i;
		}
	
		System.out.println(sum);*/
		
		
/*	Hashtable h1 = new Hashtable<>();
	h1.put(1,"tom");
	h1.put(2,"test");
	
	Hashtable h2 = new Hashtable<>();
	h2 = (Hashtable)h1.clone();
	System.out.println(h1);
	System.out.println(h2);
	///h1.clear();
	
	System.out.println(h1);
	System.out.println(h2);
	if(h1.equals(h2)){
		System.out.println("equals");
	}
	
	*/}
	
	public static long lcm(long n1,long n2) {
		
		lcm = n1>n2 ? n1 : n2;
		while(true) {
			if(lcm%n1==0&&lcm%n2==0) 
				break;
			else
				lcm++;
			}
		return lcm;
	}
	/**
	 * 
	 * lcm practice
	 */
	public static int lcmPractise(int n1, int n2){
		lcmPractise = n1>n2 ? n1 : n2;
		while (true){
			if(lcmPractise%n1==0 && lcmPractise%n2==0){
				break;
			}else 
				lcmPractise++;
			
		}
		return lcmPractise;
	}
}