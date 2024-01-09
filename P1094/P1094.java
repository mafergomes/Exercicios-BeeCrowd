import java.util.Scanner;

public class P1094 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0;
        int tc = 0;
        int tr = 0;
        int ts = 0;
    
        int qtd_exp = Integer.parseInt(s.nextLine()); 
        for (int i = 0; i <qtd_exp; i++) {
            String tmp = s.nextLine();
            int qtd1 = Integer.parseInt(tmp.split(" ")[0]); // .split separar informacao, no caso, pega o numero
            String tipo = tmp.split(" ")[1];                // ..parseInt transforma uma informacao, no caso, um int em string
    
            switch (tipo) {
            case "C" :
                total += qtd1; // + é acumulo
                tc += qtd1;
                break; // quebra a repeticao
            case "R" :
                total += qtd1; // + é acumulo
                tr += qtd1; 
            case "S" :
                total += qtd1; // + é acumulo
                ts += qtd1; 
            }
        }
        System.out.printf("Total: %d cobaias\n", total);
        System.out.printf("Total de coelhos: %d\n", tc);
        System.out.printf("Total de ratos: %d\n", tr);
        System.out.printf("Total de sapos: %d\n", ts);
        s.close();
    }
    
}