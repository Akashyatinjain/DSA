
import java.util.Scanner;

class Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(n, 1);
    }

    static int printNumbers(int n, int i) {

        if (i > n) {
            return 0;
        }
        System.err.println("The no is " + i);
        printNumbers(n, i + 1);
        return 0;

    }
}
