import java.util.Scanner;

public class P1010 {
 
    public static void main(String[] args) {
 
        Scanner s = new Scanner(System.in);
        int c1= s.nextInt();
        int n1= s.nextInt();
        float v1= s.nextFloat();
        int c2= s.nextInt();
        int n2= s.nextInt();
        float v2= s.nextFloat();
        float r= (n1*v1)+(n2*v2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", r);
 
    }
 
}