
class LeftShiftArray {

    public static void main(String[] args) {
        int arr[] = {8, 1, 3, 8, 2, 4, 6, 1, 0, 5, 6};
        int n = arr.length;
        int temp = arr[0];
        int[] samArr = new int[n];
        for (int i = 1; i <= n - 1; i++) {
            samArr[i - 1] = arr[i];
        }
        samArr[n - 1] = temp;
        for (int i = 0; i <= n - 1; i++) {
            System.err.print(samArr[i] + " ");
        }
    }
}
