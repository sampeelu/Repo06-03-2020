
public class StaticBlock {
	static int i;
	static int k = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(StaticBlock.i);
		
		StaticBlock s = new StaticBlock();
		s.publ();
	}

	static {
		i = 3;
		System.out.println(i);
		System.out.println("static block");
	}
	
	StaticBlock(){
		System.out.println("constroctor called");
	}
	
	public void publ() {
		
		System.out.println(k);


	}
}
