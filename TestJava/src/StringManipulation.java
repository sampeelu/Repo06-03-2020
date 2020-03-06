import java.util.Scanner;

public class StringManipulation {
	final static String atoz= "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
	static int temp=0;
	static int position;
	static int v=1;
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter input String.");
		String input = s.next().toLowerCase();
		for(int i=0;i<input.length();i++) {
			position = atoz.indexOf(input.charAt(i))+1;
			System.out.print(position+",");
			if(position%2==0) {
				temp =position+temp;
				v++;
			}
			if(position%2!=0 && input.length()!=v) {
				temp=position-temp;
				v++;
			}
			if(input.length()==v) {
				temp*=position;
				}
		}
		System.out.println("\n final result :"+temp);
	}
}
