//Ahmed salem
//20216002
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int x = input.nextInt();
            boolean isPrime = true;
            if (x < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= x; j++) {
                    if (x % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not");
            }
        }
        input.close();
    }
}