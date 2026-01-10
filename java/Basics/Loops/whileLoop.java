
public class whileLoop {

    public static void main(String[] args) {
        //     Scanner Pv = new Scanner(System.in);
        //     int n = Pv.nextInt();
        //     int fact = 1;
        //     while (n > 0) {
        //         fact *= n;
        //         n--;
        //     }
        //     System.err.println("factorial is :- " + fact);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 6;
        for (int num : arr) {
            if (num == target) {
                System.err.println("The no is found at index : " + num);
                break;
            }
            System.out.println("Checking: " + num);
        }

        for (int num : arr) {
            if (num % 2 == 0) {
                continue;
            }
            System.out.println("odd no : " + num);
        }
    }
}
