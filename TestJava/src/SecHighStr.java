import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class SecHighStr implements Comparable<SecHighStr>{
	int marks;
	SecHighStr(int marks){
		this.marks=marks;
	}
	public static void main(String[] args) {

		String str = "i love my bharat";
		//secHighStr(str);

		MaxMinimaStr(str);



		//System.out.println(s4[s4.length-2]);
		/*int count=1;
		TreeMap<Integer, String> m = new TreeMap<>();
		for(String str_ : s4){
			m.put(str_.length(), str_);
		}
		System.out.println(m);
		System.out.println(m.get(m.size()-1));*/
	}
	@Override
	public int compareTo(SecHighStr o) {
		// TODO Auto-generated method stub
		return this.marks-o.marks;
	}


	/**
	 * 2nd highest str
	 * @param str
	 */
	public static void secHighStr(String str){

		String[] s4 = str.split(" ");
		for(int i=0;i<s4.length;i++){
			for(int j=i+1;j<s4.length;j++){
				if(s4[i].length()>s4[j].length()){
					String temp1 = s4[i];
					s4[i]=s4[j];
					s4[j]=temp1;
				}
			}
		}
		
		System.out.println(s4[s4.length-2]);

	}



	/**
	 * Max Mina string in string
	 */
	public static void MaxMinimaStr(String str){
		String[] s4 = str.split(" ");
		String max=s4[0],min=s4[0];
		for(int i=0;i<s4.length-1;i++){
			if(s4[i+1].length()>max.length()){
				max = s4[i+1];
			}else if(s4[i+1].length()<min.length()){
				min = s4[i+1];
			}
		}
		System.out.println("max string are : "+max+" min string are : "+min);
	}
}
