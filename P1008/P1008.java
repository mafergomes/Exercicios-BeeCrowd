import java.util.Scanner;

public class P1008 {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        int h= s.nextInt();
        float v= s.nextFloat();
        float salario = h*v;
        System.out.printf("NUMBER = %d\n", x);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        

    }
 
}