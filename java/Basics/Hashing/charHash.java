
import java.util.Scanner;

class charHash {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // LOWER CASE          

        // int[] hash = new int[26];
        // for (int i = 0; i < s.length(); i++) {
        //     hash[s.charAt(i) - 'a']++;
        // }
        // int q = sc.nextInt();
        // while (q-- > 0) {
        //     char c;
        //     c = sc.next().charAt(0);
        //     System.out.println(hash[c - 'a']);
        // }
        // BOTH LOWER AND UPPER CASE
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0);
            // fetch:
            System.out.println(hash[c]);
        }
    }
}
