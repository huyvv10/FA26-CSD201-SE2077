
import java.util.Scanner;
import jdk.nashorn.internal.ir.Symbol;


public class Factorial {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Input n = ");
        int n = sn.nextInt();
        System.out.println(n+"! = "+factorial(n));
        System.out.println("");
    }

}
