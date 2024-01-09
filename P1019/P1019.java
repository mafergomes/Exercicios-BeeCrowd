import java.util.Scanner;

public class P1019 {
 
    public static void main(String[] args) {
 
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int hr = N/3600;
		int min = (N - (hr*3600)) / 60;
		int seg = N - (hr*3600) - (min*60);

		System.out.println(hr + ":" + min + ":" + seg);
    }
 
}