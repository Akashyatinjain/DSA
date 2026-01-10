
import java.util.HashMap;

class longSubSumNegPov {

    public static void main(String[] args) {
        int arr[] = {-1, 1, 1};
        int K = 1;
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: Subarray from 0 to i
            if (sum == K) {
                maxLen = i + 1;
            }

            // Case 2: Subarray exists in between
            if (map.containsKey(sum - K)) {
                int len = i - map.get(sum - K);
                maxLen = Math.max(maxLen, len);
            }

            // Store first occurrence of sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        System.out.println("the max length is" + maxLen);
    }
}
