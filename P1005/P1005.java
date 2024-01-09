import java.util.Scanner;

public class P1005 {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	    double A= s.nextDouble();
	    double B= s.nextDouble();
	    double x= (A*3.5)+(B*7.5);
	    double m= x/11;
	    System.out.printf("MEDIA = %.5f\n", m);
    }
 
}