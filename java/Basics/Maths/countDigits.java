
import java.util.Scanner;

class countDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        while (n != 0) {
            n = n / 10;
            temp++;
        }
        System.err.println("The Number os digits are" + temp);
    }
}
