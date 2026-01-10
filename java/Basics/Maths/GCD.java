
import java.util.Scanner;

class GCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = 1;
        for (int i = Math.min(a, b); i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }
        System.err.println("The GCD of the number is " + gcd);

        // 2 Approch
        // while (b != 0) {
        //     int temp = b;
        //     b = a % b;
        //     a = temp;
        // }
        // System.err.println("The  GCD os the number is " + a);
    }
}
