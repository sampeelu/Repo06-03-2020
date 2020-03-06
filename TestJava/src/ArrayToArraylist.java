import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArraylist {

	public static void main(String[] args) {
		
		String[] array = {"ram","shayam","moti","tomi","pandu","mahesha"};
		
//		System.out.println(array);
		// convert to array to arraylist
		ArrayList lst = new ArrayList(Arrays.asList(array));
	
		lst.add("jain");
		System.out.println(lst);
		
		// array to arraylist to array
		ArrayList alist = new ArrayList();
		alist.add("ghnshyam");
		alist.add("delhi");
		alist.add("bengaluru");
		alist.add("kolkata");
		alist.add("punjab");
		
		//System.out.println(alist);
		
		Object[] arr = alist.toArray(new String[alist.size()]);
		
		System.out.println(arr[3]);
		
		

	}

}
