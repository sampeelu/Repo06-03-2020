import java.util.HashMap;
import java.util.Map;

public class StringExam {

	public static void main(String[] args) {
		stroutputchange("aabacdddefggh");
		//test("sssaakkdsff");
		//printNumOfCountStr("kkkkksalllkfkgg");
		
	}
	public static void stroutputchange(String str){
		Map<Character,Integer> m =  new HashMap<Character,Integer>();
		int count =1;
		char []arr = str.toCharArray();
		for(int i=0; i <=arr.length-1; i++){
			if(m.containsKey(arr[i]))
				m.put(arr[count++],m.get(arr[i])+1);
			else
				m.put(arr[i],1);
			//m.put(arr[count++],1);
		}
		System.out.println(m);
		System.out.println("...........................");
		for(Map.Entry<Character,Integer> entry : m.entrySet()){
			if(entry.getValue()==1){
				System.out.println(entry);
				
			}
		}


	}


	public static void test(String input){
		int count=1;
		int i;
		for(i=0;i<input.length()-1;i++){
			System.out.print(input.charAt(i));
			
			if(((input.charAt(i)==input.charAt(i+1)))){
				count++;
				//continue;
			}else{
				System.out.print(count);
				count=1;
			}
		}
		System.out.print(input.charAt(i)+""+count);
	}

	/**
	 * count the number of string
	 * 
	 */
	
	public static void printNumOfCountStr(String str){
		int i,count = 1;
		for(i = 0;i<str.length()-1;i++){
			System.out.print(str.charAt(i));
			if(str.charAt(i)==str.charAt(i+1)){
				count++;
				continue;
			}
			else
				System.out.print(count);
			count = 1;
		}
		System.out.println(str.charAt(i)+""+count);
		
	}
}