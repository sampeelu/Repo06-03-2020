
public class RevWords {

	public static void main(String[] args) {
		revWords("how are");

	}
	
	public static void revWords(String str){
		String sr1[] = str.split(" ");
		String rev = "";
		for(int i=sr1.length-1;i>=0;i--){
			
			rev = rev+sr1[i]+" ";
			
		}
		System.out.println(rev);
		
	}

}
