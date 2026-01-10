
import java.util.Scanner;

class isPalindrome {

    public boolean isPalindrome(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            // Overflow checks before doing rev * 10 + pop
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return false;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return false;
            }
            rev = rev * 10 + pop;
        }
        if (x == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            return;
        }
        int n = sc.nextInt();
        isPalindrome sol = new isPalindrome();
        System.out.println(sol.isPalindrome(n));
    }
}
