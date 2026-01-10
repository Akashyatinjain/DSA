
import java.util.ArrayList;
import java.util.Scanner;

class Divisors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                list.add(i);
            }
        }
        if (list.size() > 2) {
            System.err.println("The numberis not prime");
        } else {
            System.err.println("The number is rpime number");
        }
        System.err.println("The list is " + list);
    }
}
