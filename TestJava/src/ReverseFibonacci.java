import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseFibonacci {
	
	public static void main(String args[]) {
	/*List<BigInteger>  reverse= new ArrayList<BigInteger>();
		BigInteger b1 = new BigInteger("0");
		BigInteger b2 = new BigInteger("1");
		BigInteger sum = new BigInteger("0");
		for(int i=0;i<99;i++) {
			sum = b1.add(b2);
			reverse.add(sum);
			b1=b2;
			b2=sum;
		}
		Collections.reverse(reverse);
		System.out.println(reverse);*/
		int temp=1;
		int i = 1235;
		char[] str = Integer.toString(i).toCharArray();
		char[] c1 = new char[str.length];
		for(char c : str) {
			temp *= Integer.parseInt(Character.toString(c));
		}
		System.out.println(temp);
		
		
		
		
		
		
		
	}
	
	
}
