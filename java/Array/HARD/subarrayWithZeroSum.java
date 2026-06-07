
import java.util.HashMap;

class subarrayWithZeroSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, 7, -7};
        System.out.println(subarrayWithZeroSum(arr));
    }

    public static int subarrayWithZeroSum(int[] arr) {
        // int n = arr.length;
        // int max = 0;
        // for (int i = 0; i < n; i++) {
        //     int sum = 0;
        //     for (int j = i; j < n; j++) {
        //         sum += arr[j];
        //         if (sum == 0) {
        //             max = Math.max(max, j - i + 1);
        //         }

        //     }
        // }
        // return max;
        int sum = 0;
        int max = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                max = Math.max(max, i + 1);
            }
            if (mpp.containsKey(sum)) {
                max = Math.max(max, i - mpp.get(sum));
            } else {
                mpp.put(sum, i);
            }
        }
        return max;
    }
}
