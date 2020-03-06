import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		//by tree set
		removeDuplicate();
		
		//hashmap
		removeDuplicate2();
	}

	public static void removeDuplicate() {

		String str  = "sambhawjain";
		String []arr = str.split("");

		TreeSet<String> t = new TreeSet<>();

		for(int i=0;i<arr.length;i++){
			t.add(arr[i]);

		}
		
		System.out.println(t);
	}

	public static void removeDuplicate2() {

		String str  = "sambhawjainaa";
		char []a = str.toCharArray();
		HashMap<Character, Integer> m = new HashMap<>();
		for(int i=0;i<a.length;i++){
			if(m.containsKey(a[i]))
				m.remove(i);
			else
				m.put(a[i], 1);
		}
		System.out.println(m);

	}

}
