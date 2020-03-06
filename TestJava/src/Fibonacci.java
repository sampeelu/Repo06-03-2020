import java.math.BigInteger;

public class Fibonacci {
	private int[] a;

    private int fib(int i) {
        assert (i>=0) : "Negative number.";

        if (a[i]==0) {
            if (i==0 || i==1) {
                a[i] = 1;
            } else {
                a[i] = fib(i - 2) + fib(i - 1);
            }
        }

        return a[i];
    }
    
    public Fibonacci(int numberTerms) {
        if (numberTerms<2) throw new IllegalArgumentException("expect at least 2 terms for a Fibonacci sequence");
        a = new int[numberTerms];
    }

    public void print() {
    	  System.out.println(a.length - 1);
    	}
    public void print(int i) {
    	  if (i > 0) {
    	    System.out.println(fib(i - 1));
    	    print(i - 1);
    	  }
    	}
    public static void main(String args[]) {
    	Fibonacci f = new Fibonacci(100);
    	f.print(100);
    }
}
