import java.util.ArrayList;
import java.util.List;

public class ReverseArrays {

	public static void main(String []args){
		ArrayList<Integer> lst = new ArrayList<>();
		lst.add(2);
		lst.add(8);
		lst.add(1);
		lst.add(12);
		lst.add(6);
		lst.add(10);
		
		revArrayList(lst);
	}
	
	public static ArrayList<Integer> revArrayList(ArrayList<Integer> lst){
		
		for(int i = 0;i<lst.size()/2;i++){
			swap(i,lst.size()-1-i,lst);			
		}
		System.out.println(lst);
		return lst;
		
	}
	
	public static void swap(int x,int y,List<Integer> lst){
		int temp = lst.get(x);
		lst.set(x, lst.get(y));
		lst.set(y, temp);
	}
	
}
