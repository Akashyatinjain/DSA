
import java.util.Scanner;

public class NumberPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            char ch = 'E';

            // for (int j = 0; j <= i; j++) {
            //     System.out.print(ch);
            //     ch--;
            // }
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch--;
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
