import java.util.Scanner;

public class P1037 {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double v = s.nextDouble();
        
        if (v>=0 && v<=25) {
            System.out.println("Intervalo [0,25]");
        } else if (v>25 && v<=50) {
            System.out.println("Intervalo (25,50]");
        } else if (v>50 && v<=75) {
            System.out.println("Intervalo (50,75]");
        } else if (v>75 && v<=100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
 
    }
 
}
