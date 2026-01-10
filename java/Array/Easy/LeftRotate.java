
class LeftRotate {

    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 2, 8, 2, 0};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1];
            arr[n - 1] = temp;
            n--;
        }
        for (int k = 0; k <= n; k++) {
            System.err.println(arr[k]);
        }
    }
}
