
class ReversePairs {

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 3, 1};
        int n = arr.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > 2 * arr[j]) {
                    cnt++;
                }
            }
        }
        System.err.println("the count of the number is " + cnt);
    }
}
