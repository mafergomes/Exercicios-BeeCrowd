import java.util.Scanner;

public class P1060 {
 
    public static void main(String[] args) {
 
        Scanner s = new Scanner(System.in);
        int x = 0;
        for (int i=0; i<6;) {
        	double n = s.nextDouble();
        	if (n > 0) {
        		x = x+1;
        	}
        	i = i+1;
        }
        System.out.printf("%d valores positivos\n", x);
 
    }
 
}