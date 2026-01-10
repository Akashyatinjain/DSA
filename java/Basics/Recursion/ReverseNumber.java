
import java.util.Scanner;

class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseNumber(5, n);
    }

    static int reverseNumber(int i, int n) {
        if (i < 1) {
            return 0;
        }
        System.err.println(i);
        reverseNumber(i - 1, n);
        return 0;
    }
}
