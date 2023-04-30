/* 
 Name: " Ahmed salem"
 ID:"20216002"
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pum = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(pum + " ");
                pum++;
            }
            System.out.println("PUM");
            pum++;
        }
    }
}
