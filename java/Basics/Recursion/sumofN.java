
import java.util.Scanner;

class sumofN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumofNo(0, n, 1);

        System.err.println("The no is " + sum);

    }

    static int sumofNo(int sum, int n, int i) {

        if (i > n) {
            return sum;
        }
        sum = sum + i;
        return sumofNo(sum, n, i + 1);
    }

}
