
import java.util.Scanner;

class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(1, 1, n);
        System.err.println("The factorial of the number is =" + fact);
    }

    static int factorial(int fact, int i, int n) {
        if (i > n) {
            return fact;
        }
        fact = fact * i;
        return factorial(fact, i + 1, n);
    }
}
