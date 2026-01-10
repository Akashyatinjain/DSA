
class Quickshort {

    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 5, 2, 10, 3, 0, 5, 4, 3, 6};
        int n = arr.length;
        QuickShort(arr, 0, n - 1);
        for (int x : arr) {
            System.err.println(x + " ");
        }
    }

    public static void QuickShort(int arr[], int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);

            QuickShort(arr, start, pi - 1);
            QuickShort(arr, pi + 1, end);
        }

    }

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j <= end; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return (i + 1);
    }
}
