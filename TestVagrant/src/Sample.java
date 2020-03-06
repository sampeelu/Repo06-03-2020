import java.util.Calendar;
import java.util.HashMap;

public class Sample {

	
	enum TOI{
		monday(3),
		tuesday(3),
		wednesday(3),
		thursday(3),
		friday(3),
		saturday(5),
		sunday(6);

		public int value;
		TOI(int value){
			this.value=value;
		}

	}

	public static void main(String[] args) {
		Sample.calculateExpenseForMont();

		//System.out.println(getcost());
	}
	

	public static void calculateExpenseForMont(){
		Calendar cal = Calendar.getInstance();
		int monday = 3;
		int tuesday = 3;
		int wednesday = 3;
		int thursday = 3;
		int friday = 3;
		int saturday = 5;
		int sunday = 6;
		HashMap<String, Integer> m = new HashMap<>();
		//System.out.println(Calendar.DAY_OF_MONTH);
		m.put("monday",3);
		m.put("tuesday",3);
		m.put("wednesday",3);
		m.put("thursday",3);
		m.put("friday",3);
		m.put("saturday",5);
		m.put("sunday",6);

			
		 /* System.out.println("The Current Month is: "
                  + cal.get( 
                        Calendar.MONTH));
		*/
		/*System.out.println(TOI.monday.value);

System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);
System.out.println(Calendar.DAY_OF_WEEK);
	*/

int january = 31;
		int sum = 0;
		int k=0;
		for(int i=1;i<=31;i++){
			
			if(!m.containsKey(cal.get(Calendar.MONDAY))){
				sum = sum+TOI.monday.value;
			
				
			}
			else if(!m.containsKey(cal.get(Calendar.TUESDAY))){
				sum = sum+TOI.tuesday.value;
				
								
			}
			else if(!m.containsKey(cal.get(Calendar.WEDNESDAY))){
				sum = sum+TOI.wednesday.value;
				
								
			}
			else if(!m.containsKey(cal.get(Calendar.THURSDAY))){
				sum = sum+TOI.thursday.value;
				
				
				
			}
			else if(!m.containsKey(cal.get(Calendar.FRIDAY))){
				sum = sum+TOI.friday.value;
				
				
			}
			else if(!m.containsKey(cal.get(Calendar.SATURDAY))){
				sum = sum+TOI.saturday.value;
				
				
				}
			else if(!m.containsKey(cal.get(Calendar.SUNDAY))){
				sum = sum+TOI.sunday.value;
				
				
				}
		}
		//System.out.println(j);
		System.out.println(sum);
	}

	public static int getcost(){
		int[] a = {3,3,3,3,3,5,6};
		int sum=0;
		for(int i=0;i<=31;i++){

			for(int j=0;j<=31;j++){
				sum = sum+a[i];
			}
		}
		System.out.println(sum);
		return sum;
	}
	
	

}
