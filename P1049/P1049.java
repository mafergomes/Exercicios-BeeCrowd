import java.util.Scanner;

public class P1049 {
 
    public static void main(String[] args) {
 
		Scanner s = new Scanner(System.in);
        String x1;
        String x2;
        String x3;
        
        x1= s.nextLine();
        x2= s.nextLine();
        x3= s.nextLine();
        
        if ("vertebrado".equals(x1) && ("ave".equals(x2)) && ("carnivoro".equals(x3))) {
            System.out.println("aguia");
        } else if ("vertebrado".equals(x1) && ("ave".equals(x2)) && ("onivoro".equals(x3))) {
            System.out.println("pomba");
        } else if ("vertebrado".equals(x1) && ("mamifero".equals(x2)) && ("onivoro".equals(x3))) {
            System.out.println("homem");
        } else if ("vertebrado".equals(x1) && ("mamifero".equals(x2)) && ("herbivoro".equals(x3))) {
            System.out.println("vaca");
        } else if ("invertebrado".equals(x1) && ("inseto".equals(x2)) && ("hematofago".equals(x3))) {
            System.out.println("pulga");
        } else if ("invertebrado".equals(x1) && ("inseto".equals(x2)) && ("herbivoro".equals(x3))) {
            System.out.println("lagarta");
        } else if ("invertebrado".equals(x1) && ("anelideo".equals(x2)) && ("hematofago".equals(x3))) {
            System.out.println("sanguessuga");
        } else if ("invertebrado".equals(x1) && ("anelideo".equals(x2)) && ("onivoro".equals(x3))) {
            System.out.println("minhoca");
        }

    }
 
}