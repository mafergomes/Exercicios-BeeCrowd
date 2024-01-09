import java.util.Scanner;

public class P1038 {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cod = s.nextInt();
        int pr = s.nextInt();
        double total = 0;
        
        if (cod > 0 && cod < 2) {
        	total = pr*4;
        } else if (cod > 1 && cod < 3) {
        	total = pr*4.5;
        } else if (cod > 2 && cod < 4) {
        	total = pr*5;
        } else if (cod > 3 && cod < 5) {
        	total = pr*2;
        } else {
        	total = pr*1.5;
        }
        
        System.out.printf("Total: R$ %.2f\n", total);

 
    }
 
}