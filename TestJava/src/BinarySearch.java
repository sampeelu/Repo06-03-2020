import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
static int mid;

public static void main(String args[]) {
	List<Integer> s1 = new ArrayList<Integer>();
	s1.add(10);s1.add(20);s1.add(2);s1.add(45);s1.add(6);s1.add(34);
	System.out.println(BinarySearch.binarysearch(s1,20));
	}
	
public static int binarysearch(List<Integer> l,int x) {
	System.out.println(l);
	Collections.sort(l);
	System.out.println(l);
	int lo=0,hi=l.size();
	mid = lo+(hi-lo)/2;
	while(lo<hi) {
		if(x==l.get(mid)) {
			mid = lo+(hi-lo)/2;break;
		}else if(x<l.get(mid)) {
			hi = mid-1;
		}else if(x>l.get(mid)){
			lo = mid+1;
		}
		mid = lo+(hi-lo)/2;
	}
	return mid;
}
	
	
	
	
}
