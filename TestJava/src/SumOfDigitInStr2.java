
public class SumOfDigitInStr2 {

	public static void main(String[] args) {
		
		String s = "sam1234mfklm43";
		int sum = 0;
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)>=48 && s.charAt(i)<=57){
				
				sum = sum+(int)s.charAt(i);
				
			}
		}
		System.out.println(sum);

	}

}
