import java.util.Scanner;

public class P1134 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int A = 0;
        int G = 0;
        int D = 0;

        while (x!=4) {
            if (x==1){
                A = A+1;
            } else if (x==2) {
                G = G+1;
            } else if (x==3) {
                D = D+1;
            }
            x = s.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", A);
        System.out.printf("Gasolina: %d\n", G);
        System.out.printf("Diesel: %d\n", D);
    }
}
