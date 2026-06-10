
// Input:
//  nums = [3, 5, 4, 1, 1]  
// Output:
//  [1, 2]  
// Explanation:
//  1 appears twice in the array, and 2 is missing from the array. So the output is [1, 2].
class Repeatingnumbers {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 7, 5, 7};
        int n = nums.length;
        // int max = 0;
        // List<Integer> arr = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (nums[i] == nums[j]) {
        //             arr.add(nums[j]);
        //         }
        //         if (nums[j] > max) {
        //             max = nums[j];
        //             System.err.println(max + "the max ");
        //         }
        //     }
        // }
        // int cnt = 0;
        // for (int i = 0; i < max; i++) {
        //     cnt = cnt + 1 + i;
        //     System.err.println(cnt + "the cnt sum");
        // }
        // int arrsum = 0;
        // for (int i = 0; i < n; i++) {
        //     arrsum = arrsum + nums[i];
        //     System.err.println(arrsum + "the arr sum");
        // }
        // arrsum = arrsum - arr.get(0);

        // int remaining = cnt - arrsum;
        // arr.add(remaining);
        // System.err.println(arr);
        //-------------------------------------------------------------------------------
        // or 
        //-------------------------------------------------------------------------------
        // int repeating = -1;
        // int missing = -1;
        // for (int i = 1; i <= n; i++) {
        //     int cnt = 0;
        //     for (int j = 0; j < n; j++) {
        //         if (nums[j] == i) {
        //             cnt++;
        //         }
        //     }
        //     if (cnt == 2) {
        //         repeating = i;
        //     } else if (cnt == 0) {
        //         missing = i;
        //     }
        //     if (repeating != -1 && missing != -1) {
        //         break;
        //     }
        // }
        // System.err.println(repeating + " the repeating " + missing);
        //-------------------------------------------------------------------------------
        // or 
        //-------------------------------------------------------------------------------
        int[] hash = new int[n + 1];
        for (int i = 0; i < n; i++) {
            hash[nums[i]]++;
        }
        int repeating = -1;
        int missing = -1;
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2) {
                repeating = i;
            } else if (hash[i] == 0) {
                missing = i;
            }
            if (repeating != -1 && missing != -1) {
                break;
            }
        }
        System.err.println(repeating + " the repeating " + missing);
    }
}
