import java.util.Scanner;

public class P1009 {
 
    public static void main(String[] args) {
 
	    Scanner s = new Scanner(System.in);
	    String a;
	    a= s.nextLine();
	    float salario= s.nextFloat();
	    float vendas= s.nextFloat();
	    double p= vendas*0.15;
	    double t= p+salario;
	    System.out.printf("TOTAL = R$ %.2f\n", t);

    }
 
}
