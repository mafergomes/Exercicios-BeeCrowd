import java.util.Scanner;

public class P1013 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int maiorAB = (a+b+Math.abs(a-b))/2;
        int maiorBC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        System.out.printf(maiorBC +" eh o maior\n");
       

    }

}