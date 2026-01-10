
class insertionsort {

    public static void main(String[] args) {
        int arr[] = {7, 5, 8, 1, 2, 1, 3, 6};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int no1 = arr[i];
            int j = i - 1;
            while (j >= 0 && no1 < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = no1;
        }
        for (int i = 0; i <= (n - 1); i++) {
            System.err.println(arr[i]);
        }
    }

}
