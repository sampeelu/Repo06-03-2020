
public class RightAnglePattern {

	public static void main(String[] args) {
		
		int row = 5;
		for(int i=1;i<=row;i++){
			for(int j =1;j<row;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		angle();

	}
	
	
	public static void angle() {
		for(int i = 0;i<=5;i++){
			for(int j = 0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
