
class rev2ARR {

    static void revArray(int arr[], int n) {
        int[] revarr = new int[n];
        int i;
        for (i = n - 1; i >= 0; i--) {
            revarr[n - 1 - i] = arr[i];
        }
        for (i = 0; i < n; i++) {
            System.err.println(revarr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int arr[] = {1, 2, 3, 4};

        revArray(arr, n);
    }
}
