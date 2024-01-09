import java.util.Scanner;

public class P1036 {
	
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();
        
        if ((A==0) | (B*B-4*A*C<0)) {
			System.out.println("Impossivel calcular");
			return;
		}
        
        double delta = Math.sqrt((B * B) - 4 * A * C);
        double R1 = (-B + delta) / (2 * A);
        double R2 = (-B - delta) / (2 * A);
        System.out.println(String.format("R1 = %.5f", R1));
        System.out.println(String.format("R2 = %.5f", R2));
    }
	
}