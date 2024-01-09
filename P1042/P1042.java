import java.util.Scanner;

public class P1042 {
 
    public static void main(String[] args) {
 
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        
        if (A<B && A<C && B<C) {
        	System.out.println(A);
        	System.out.println(B);
        	System.out.println(C);
        } else if (B<A && B<C && A<C) {
    	    System.out.println(B);
    	    System.out.println(A);
    	    System.out.println(C);
        } else if (A<B && A<C && C<B) {
        	System.out.println(A);
    	    System.out.println(C);
    	    System.out.println(B);
        } else if (B<A && B<C && C<A) {
        	System.out.println(B);
    	    System.out.println(C);
    	    System.out.println(A);
        } else if (C<A && C<B && A<B) {
        	System.out.println(C);
    	    System.out.println(A);
    	    System.out.println(B);
        } else {
        	System.out.println(C);
    	    System.out.println(B);
    	    System.out.println(A);
        }
        
    	System.out.println("");
    	System.out.println(A);
    	System.out.println(B);
    	System.out.println(C);
 
    }
 
}
