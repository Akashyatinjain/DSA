
class revArr2point {

    static void revarr(int[] arr, int n) {
        int p1 = 0;
        int p2 = n - 1;
        while (p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        for (int i = 0; i < n; i++) {
            System.err.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = 6;
        int arr[] = {1, 2, 3, 4, 5, 6};
        revarr(arr, n);
    }
}
