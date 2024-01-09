import java.util.Scanner;

public class P1017 {
 
    public static void main(String[] args) {
 
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int vm = s.nextInt();
		double c = (h*vm);
		double d = c/12;
		System.out.printf("%.3f\n", d);
 
    }
 
}