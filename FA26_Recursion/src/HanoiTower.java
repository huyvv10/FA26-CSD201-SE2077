import java.util.Scanner;
public class HanoiTower {

    public static void hanoiTower(int n, char S, char D, char T){
        if (n==1){
            System.out.println("Move disk " + n + " from "+S+" to "+ D);
        } else{
            hanoiTower(n-1, S, T, D);
            System.out.println("Move disk " + n + " from "+S+" to "+ D);
            hanoiTower(n-1, T, D, S);
        }
    }
            
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Input number of disk: ");
        int n = sn.nextInt();
        hanoiTower(n, 'A', 'C', 'B');
        System.out.println("");
    }
}
