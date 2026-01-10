
import java.util.Scanner;

class name {

    static void printName(String name, int i, int n) {
        if (i > n) {
            return;
        }
        System.err.println("Your Name is " + name);
        printName(name, i + 1, n);
    }

    public static void main(String[] args) {
        System.err.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printName(name, 1, 4);

    }
}
