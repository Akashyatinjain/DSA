
import java.util.Scanner;

class basicCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 🔹 Find max value to decide hash size
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // 🔹 Create hash array based on max value
        int[] hash = new int[max + 1];

        // 🔹 Precompute frequencies
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        System.out.println("Enter query numbers:");
        while (q-- > 0) {
            int number = sc.nextInt();
            if (number <= max && number >= 0) {
                System.out.println(hash[number]);
            } else {
                System.out.println(0); // number not present
            }
        }

        sc.close();
    }
}
