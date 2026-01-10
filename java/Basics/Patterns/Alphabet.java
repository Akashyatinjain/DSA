
import java.util.Scanner;

public class Alphabet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        char ch = 'A';
        int ascii = (int) ch;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ascii++;
                ch = (char) ascii;
            }
            System.out.println("");
        }
    }
}
