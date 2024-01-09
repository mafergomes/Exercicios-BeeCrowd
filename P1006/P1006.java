import java.util.Scanner;

public class P1006 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	    double A= s.nextDouble();
	    double B= s.nextDouble();
	    double C= s.nextDouble();
	    double x= (A*2)+(B*3)+(C*5);
	    double m= x/10;
	    System.out.printf("MEDIA = %.1f\n", m);

	}

}
