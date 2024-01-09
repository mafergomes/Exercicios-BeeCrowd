import java.util.Scanner;

public class P1012 {
 
    public static void main(String[] args) {
 
		Scanner s = new Scanner(System.in);
		double pi = 3.14159;
		double A = s.nextDouble();
		double B = s.nextDouble();
		double C = s.nextDouble();
		double tr = (A*C)/2;
		double c = pi*C*C;
		double t = (A+B)*C/2;
		double q = B*B;
		double r = A*B;
		System.out.printf("TRIANGULO: %.3f\n", tr);
		System.out.printf("CIRCULO: %.3f\n", c);
		System.out.printf("TRAPEZIO: %.3f\n", t);
		System.out.printf("QUADRADO: %.3f\n", q);
		System.out.printf("RETANGULO: %.3f\n", r);
        
 
    }
 
}