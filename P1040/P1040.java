import java.util.Scanner;
public class P1040 {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float n1 = s.nextFloat();
        float n2 = s.nextFloat();
        float n3 = s.nextFloat();
        float n4 = s.nextFloat();
        float m = ((n1*2)+(n2*3)+(n3*4)+(n4*1));
        float media = m/10;
        
        if (media >= 7) {
        	System.out.printf("Media: %.1f\n", media);
        	System.out.println("Aluno aprovado.");
        } else if (media < 5) {
        	System.out.printf("Media: %.1f\n", media);
        	System.out.println("Aluno reprovado.");

        } else if (media >= 5 && media <= 6.9) {
        	System.out.printf("Media: %.1f\n", media);
        	System.out.println("Aluno em exame.");
        	float ex = s.nextFloat();
        	System.out.printf("Nota do exame: %.1f\n", ex);
        	float n = (media+ex);
        	float notaf = n/2;
        	if (notaf >= 5) {
        		System.out.println("Aluno aprovado.");
        		System.out.printf("Media final: %.1f\n", notaf);
        	} else if (notaf <= 4.9) {
        		System.out.println("Aluno reprovado.");
        		System.out.printf("Media final: %.1f\n", notaf);
        	}
        }
 
    }
 
}