import java.util.Scanner;

public class P1002 {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n = 3.14159;
        double r = s.nextDouble();
        double A = n*(r*r);
        System.out.printf("A=%.4f\n", A);
        s.close();
    }
 
}

