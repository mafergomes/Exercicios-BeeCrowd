import java.util.Scanner;

public class P1011 {
 
    public static void main(String[] args) {
 
       Scanner s = new Scanner(System.in);
       int r= s.nextInt();
       double pi= 3.14159;
       double valor= (4.0/3)*pi*Math.pow(r, 3);
       System.out.printf("VOLUME = %.3f\n", valor);
 
    }
 
}
