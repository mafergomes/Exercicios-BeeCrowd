import java.util.Scanner;

public class P1015 {
 
    public static void main(String[] args) {
 
        Scanner s = new Scanner(System.in);
        float x1= s.nextFloat();
        float y1= s.nextFloat();
        float x2= s.nextFloat();
        float y2= s.nextFloat();
        double D= Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2));
        System.out.printf("%.4f\n", D);
 
    }
 
}