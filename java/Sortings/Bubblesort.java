
class Bubblesort {

    public static void main(String[] args) {
        int arr[] = {3, 5, 9, 4, 1, 2};
        int n = arr.length - 1;
        int p1 = 0, p2 = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= n - 1 - i; j++) {
                p1 = arr[j];
                p2 = arr[j + 1];
                if (p1 > p2) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.err.println("After comparing index " + j + " and " + (j + 1));
                System.err.println("Array now:");
                for (int k = 0; k < n; k++) {
                    System.err.print(arr[k] + " ");
                }
                System.err.println("\n--------------------");
            }
        }

        System.err.println("The array elements are :");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.err.println(arr[i] + " ");
        }
    }
}
