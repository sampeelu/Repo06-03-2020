
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pm(19);
		
		if(isPm(11))
			System.out.println("true");
		else
			System.out.println("false");
		System.out.println();
		//pm(101);
		
		if(isPrime(11))
			System.out.println("true");
			else
				System.out.println("false");
	}
	 static boolean isPrime(int n) 
	    { 
	        // Corner case 
	        if (n <= 1) 
	            return false; 
	       
	        // Check from 2 to n-1 
	        for (int i = 2; i < n; i++) 
	            if (n % i == 0) 
	                return false; 
	       
	        return true; 
	    } 
	 
	 
	 /**
	  * 
	  * practise of prime numbers
	  */
	 public static void pm(int n) {
		//int a = 0,b=1,c;
		int count =0;
		 for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
			
				
			}
		 if(count==2){
				System.out.println(n +" : is pm");
		}
	}
	 
	 /**
	  * 
	  * practise2 of prime numbers
	  */
	 public static boolean isPm(int n) {
	 
	 if(n<=1)
		 return false;
	 int i;
	 for(i=2;i<n;i++)
		 if(n%i==0)
			 return false;
					 
					 return true;
			 
	 }
}
