import java.util.ArrayList;

public class CommonEleFormList {

	public static void main(String[] args) {
		 ArrayList<Integer> al1 = new ArrayList<Integer>();
	     ArrayList<Integer> al2 = new ArrayList<Integer>();
	     al1.add(10);
	     al1.add(20);
	     al1.add(30);
	     al1.add(60);
	 
	     al2.add(20);
	     al2.add(30);
	     al2.add(50);
	 
	     al1.removeAll(al2);
	     
	 
	     System.out.println(al1);    

	}

}
