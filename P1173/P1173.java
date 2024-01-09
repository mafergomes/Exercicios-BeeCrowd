import java.util.Scanner;

public class P1173 {
	
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vetor[] = new int[10];

        vetor[0] = s.nextInt();
        for (int i=1; i <10; i++) {
            vetor[i] = vetor[i-1] * 2;
        }
        for (int i=0; i<10; i++) {
            System.out.println("N["+ i +"] = " + vetor[i]);
        }
    }
	
}