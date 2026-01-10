
class RightShiftArray {

    public static void main(String[] args) {
        int arr[] = {1, 3, 7, 4, 6, 2, 5, 9};
        int n = arr.length;
        int temp = arr[n - 1];
        int[] samArr = new int[n];
        for (int i = 1; i <= n - 1; i++) {
            samArr[i] = arr[i - 1];
        }
        samArr[0] = temp;
        for (int i = 0; i <= n - 1; i++) {
            System.err.print(samArr[i] + " ");
        }
    }
}
