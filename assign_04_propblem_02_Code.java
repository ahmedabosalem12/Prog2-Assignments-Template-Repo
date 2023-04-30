//Ahmed salem
//20216002
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= 12; i++) {
            int result = n * i;
            System.out.println(n + " * " + i + " = " + result);
        }
        input.close();
    }
}
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
