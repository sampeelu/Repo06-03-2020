
public class Patterns {

	public static void main(String[] args) {
			//t1();
			System.out.println("......................................");
		//t2();
		System.out.println("......................................");
			printPattern(5);
		System.out.println("....................");
	// reverse traingle hollow pattern
	//	t3(5);
		System.out.println("....................");
		t5(5);


	}

	public static void t1() {
		int i,k=0;
		for(i=1;i<=5;i++) {		
			for( k=5;k>=i;k--) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				if(k == 0 || k == 2 * i - 2)
					System.out.print(" *");
				
			}
			System.out.println();
		}

	}
	
	public static void t2() {
		
		for (int i = 0; i <5; i++) {
			for (int j =5; j >i; j--) {
				
				System.out.print(" ");
			}
			for (int k = 0; k <=i; k++) {
				System.out.print(" "+"*");
			}
			System.out.println();
		}
		
	}
	
	/**
	 * hollow traingle 
	 */
	 static void printPattern(int n) 
	    { 
	        int i, j, k = 0; 
	        for (i = 1; i <= n; i++) // row=6 
	        { 
	            // Print spaces 
	            for (j = i; j < n; j++) { 
	                System.out.print(" "); 
	            } 
	            // Print # 
	            while (k != (2 * i - 1)) { 
	                if (k == 0 || k == 2 * i - 2) 
	                    System.out.print("*"); 
	                else
	                    System.out.print(" "); 
	                k++; 
	                 
	            } 
	            k = 0; 
	              
	            // print next row 
	            System.out.println();  
	        } 
	        // print last row 
	        for (i = 0; i < 2 * n - 1; i++) { 
	            System.out.print("*"); 
	        } 
	    } 

	 
	 /**
	  * 
	  * 
	  */
	 public static void t3(int n) {
		 int i, j; 
	        for (i = 1; i <= n; i++) { 
	      
	            // Print spaces 
	            for (j = 1; j < i; j++) { 
	                System.out.print(" "); 
	            } 
	      
	            // Print hollow inverted pyramid 
	            for (j = 1; j <= (n * 2 - (2 * i - 1)); 
	                                        j++) { 
	      
	                if (i == 1 || j == 1 ||  
	                    j == (n * 2 - (2 * i - 1))) { 
	                    System.out.print("#"); 
	                } 
	                else { 
	                    System.out.print(" "); 
	                } 
	            } 
	      
	            // next line 
	            System.out.println(); 
	        } 
	    } 
	

	 static void t5(int n) 
	    { 
	        int i, j, k = 0; 
	        for (i = 1; i <= n; i++) // row=6 
	        { 
	            // Print spaces 
	            for (j = i; j < n; j++) { 
	                System.out.print(" "); 
	            } 
	            // Print # 
	            while (k != (2 * i - 1)) { 
	                if (k == 0 || k == 2 * i - 2) 
	                    System.out.print("#"); 
	                else
	                    System.out.print(" "); 
	                k++; 
	                ; 
	            } 
	            k = 0; 
	              
	            // print next row 
	            System.out.println();  
	        } 
	        // print last row 
	        for (i = 0; i < 2 * n - 1; i++) { 
	            System.out.print("#"); 
	        } 
	    } 
}
	 




