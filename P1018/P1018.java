import java.util.Scanner;

public class P1018 {
 
    public static void main(String[] args) {
 
       Scanner s = new Scanner(System.in);
        int notas = s.nextInt();
        int x = notas;
        int notas100 = x / 100;
        x -= notas100 * 100;
        int notas50 = x / 50;
        x -= notas50 * 50;
        int notas20 = x / 20;
        x -= notas20 * 20;
        int notas10 = x / 10;
        x -= notas10 * 10;
        int notas5 = x / 5;
        x -= notas5 * 5;
        int notas2 = x / 2;
        x -= notas2 * 2;
        int notas1 = x;
        
        System.out.println(notas);
        System.out.printf("%d nota(s) de R$ 100,00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50,00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20,00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10,00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5,00\n", notas5);
        System.out.printf("%d nota(s) de R$ 2,00\n", notas2);
        System.out.printf("%d nota(s) de R$ 1,00\n", notas1);
    }
	
}