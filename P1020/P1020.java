import java.util.Scanner;

public class P1020 {
 
    public static void main(String[] args) {
 
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int anos = n/365;
        int meses = n%365;
        int dias = meses%30;
        meses = meses/30;
        System.out.printf("%d ano(s)\n", anos);
        System.out.printf("%d mes(es)\n", meses);
        System.out.printf("%d dia(s)\n", dias);
 
    }
 
}
