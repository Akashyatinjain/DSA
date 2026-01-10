
import java.util.Scanner;

public class Alphabetpyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Spaces before letters
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }

            char ch = 'A';
            int breakpoint = (2 * i - 1) / 2;

            // Letters
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(ch);
                if (j < breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }

            System.out.println();
        }
    }
}
