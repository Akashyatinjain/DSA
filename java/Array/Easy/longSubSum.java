
//import java.util.HashMap;
//                  Time complexity O(N3)
// class longSubSum {
//     public static void main(String[] args) {
//         int nums[] = {10, 5, 2, 7, 1, 9};
//         int key = 15;
//         int len = 0;
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i; j < nums.length; j++) {
//                 int sum = 0;
//                 for (int k = i; k <= j; k++) {
//                     sum = sum + nums[k];
//                 }
//                 if (sum == key) {
//                     len = Math.max(len, j - i + 1);
//                 }
//             }
//         }
//         System.err.println("The length is " + len);
//     }
// }
//
//
//                  Time complexity O(N2)
// class longSubSum {
//     public static void main(String[] args) {
//         int nums[] = {10, 5, 2, 7, 1, 9};
//         int key = 15;
//         int len = 0;
//         for (int i = 0; i < nums.length; i++) {
//             int sum = 0;
//             for (int j = i; j < nums.length; j++) {
//                 sum = sum + nums[j];
//                 if (sum == key) {
//                     len = Math.max(len, j - i + 1);
//                 }
//             }
//         }
//         System.err.println("The length is " + len);
//     }
// } 
//
//
//                     HASH MAP 
// class longSubSum {
//     public static void main(String[] args) {
//         int nums[] = {10, 5, 2, 7, 1, 9};
//         int key = 15;
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int sum = 0;
//         int maxlen = 0;
//         for (int i = 0; i < nums.length; i++) {
//             sum = sum + nums[i];
//             if (sum == key) {
//                 maxlen = i + 1;
//             }
//             if (map.containsKey(sum - key)) {
//                 int len = i - map.get(sum - key);
//                 maxlen = Math.max(maxlen, len);
//             }
//             if (!map.containsKey(sum)) {
//                 map.put(sum, i);
//             }
//         }
//         System.out.println("The length is " + maxlen);
//     }
// }
//                     While Loop 
class longSubSum {

    public static void main(String[] args) {
        int nums[] = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int n = nums.length;
        int maxlen = 0;
        int left = 0, right = 0;
        int sum = nums[0];
        while (right < n) {

            while (left <= right && sum > k) {
                sum = sum - nums[left];
                left++;
            }

            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
            right++;
            if (right < n) {
                sum = sum + nums[right];
            }
        }
        System.err.println("The max length can be" + maxlen);
    }
}
