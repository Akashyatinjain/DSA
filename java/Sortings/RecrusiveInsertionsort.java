
class RecrusiveInsertionsort {

    public static void main(String[] args) {
        int arr[] = {8, 9, 4, 1, 5, 5, 0, 2, 3, 7, 8, 9};
        int n = arr.length;
        insertionsort(arr, n);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void insertionsort(int arr[], int n) {
        if (n <= 1) {
            return;
        }
        insertionsort(arr, n - 1);
        int key = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}
