
import java.util.Scanner;

public class InvertedLoopNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < (n * 2 - 1); i++) {
            for (int j = 0; j < (n * 2 - 1); j++) {
                int top = i;
                int bottom = j;
                int right = (2 * n - 2) - j;
                int left = (2 * n - 2) - i;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " "); // distance 

            }
            System.out.println();
        }
    }
}
