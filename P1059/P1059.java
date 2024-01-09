import java.util.Scanner;

public class P1059 {
 
    public static void main(String[] args) {
 
        Scanner s = new Scanner(System.in);
        for (int i=1; i<101;) {
        	if (i%2==0) {
        		System.out.println(i);
        	}
        	i= i+1;
        }
    }
 
}