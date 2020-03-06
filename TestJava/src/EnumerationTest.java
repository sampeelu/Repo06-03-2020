import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {

		Vector v = new Vector();
		for(int i=0;i<=9;i++){
			v.addElement(i);
		}
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()){
			//System.out.println(e.nextElement());
			int i = (Integer)e.nextElement();
			System.out.print(i);
			
		}
		
	}

}