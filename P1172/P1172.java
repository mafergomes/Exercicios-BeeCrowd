import java.util.Scanner;
import java.util.Arrays;

public class P1172 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0; i<arr.length; i++){ 
            arr[i] = s.nextInt();
            if (arr[i] <= 0 ) {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}