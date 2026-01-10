
class RecruciveBubblesort {

    public static void main(String[] args) {
        int arr[] = {8, 9, 5, 6, 7, 1, 4, 2, 0, 3};
        int n = arr.length;
        Bubblesort(arr, n);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void Bubblesort(int arr[], int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        Bubblesort(arr, n - 1);
    }
}
