import java.util.Scanner;

public class P1047 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hora1 = s.nextInt();
        int min1 = s.nextInt();
        int hora2 = s.nextInt();
        int min2 = s.nextInt();
        int m1 = (hora1*60) + min1;
        int m2 = (hora2*60) + min2;
        int h24 = (24*60);
        int r = 0;
        if (m2>m1) {
            r = m2-m1;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(r/60), (r%60));
        }else if (m1>m2) {
            r = (h24-m1)+(m2);
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(r/60), (r%60));
        }else if (m2==m1){
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",24, 0);
        }
       
    }
}