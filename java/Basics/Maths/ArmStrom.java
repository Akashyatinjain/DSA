
import java.util.Scanner;

class ArmStrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int temp = a;
        int ptr = 0;
        while (temp != 0) {
            temp = temp / 10;
            ptr++;
        }
        System.err.println(ptr);
        int sum = 0;
        temp = a;
        while (temp != 0) {
            int digit = temp % 10;
            sum = (int) (sum + Math.pow(digit, ptr));
            temp = temp / 10;
        }

        if (sum == a) {
            System.out.println(a + " is an Armstrong number.");
        } else {
            System.out.println(a + " is NOT an Armstrong number.");
        }
    }
}
