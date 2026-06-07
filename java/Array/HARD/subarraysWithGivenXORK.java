
class subarraysWithGivenXORK {

    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 6, 4};
        int k = 6;
        int n = arr.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int xor = 0;
            for (int j = i; j < n; j++) {
                xor = xor ^ arr[j];
                if (xor == k) {
                    cnt++;
                }
            }
        }
        System.err.println(cnt);

    }
}
