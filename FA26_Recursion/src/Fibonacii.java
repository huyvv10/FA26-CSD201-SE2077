
import java.util.Scanner;


public class Fibonacii {

    public static int fibonacii(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacii(n - 1) + fibonacii(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacii(i)+" ");
        }
        System.out.println("");
    }
}
