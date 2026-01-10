
class Selection {

    public static void main(String[] args) {
        int arr[] = {64, 55, 98, 41, 65, 12, 10, 1, 5, 3, 6, 7, 9};
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
