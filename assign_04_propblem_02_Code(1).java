//Ahmed Mahmoud
//20216742
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                System.out.print("1 ");
            } else if (a[i] < 0) {
                System.out.print("2 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}
