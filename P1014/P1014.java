import java.util.Scanner;

public class P1014 {
 
    public static void main(String[] args) {
 
        Scanner s = new Scanner(System.in);
        int X= s.nextInt();
        float Y= s.nextFloat();
        double km= X/Y;
        System.out.printf("%.3f km/l\n", km);
 
    }
 
}
