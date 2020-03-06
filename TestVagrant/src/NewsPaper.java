
public class NewsPaper {

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
		
		for(int i=1;i<=31;i++){
			//System.out.println(i);
			if(TOI.sunday.equals(TOI.values())){
				System.out.println("sunday");
				for(TOI t : TOI.values()){
					System.out.println(t.value);
				}
			}
		}
	}

}
