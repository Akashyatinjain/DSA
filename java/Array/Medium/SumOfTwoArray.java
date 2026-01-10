
import java.util.Arrays;

class Solution {

    // Function to check if any two numbers sum up to target (variant 1)
    public String twoSumExists(int[] arr, int target) {
        int n = arr.length;
        // // Outer loop picks one element at a time
        // for (int i = 0; i < n; i++) {
        //     // Inner loop searches for another element that complements arr[i]
        //     for (int j = i + 1; j < n; j++) {
        //         // If sum equals target, return "YES"
        //         if (arr[i] + arr[j] == target) {
        //             return "YES";
        //         }
        //     }
        // }
        // No pair found that sums to target

        //              HashMap 
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        //     int cnt = target - arr[i];
        //     if (map.containsKey(cnt)) {
        //         return "YES";
        //     }
        //     map.put(arr[i], i);
        // }
        int left = 0, right = n - 1;
        int[][] arrnew = new int[n][2];
        for (int i = 0; i < n; i++) {
            arrnew[i][0] = arr[i];
            arrnew[1][1] = i;
        }

        Arrays.sort(arrnew, (a, b) -> Integer.compare(a[0], b[0]));
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return "NO";
    }

    public int[] twoSumIndices(int[] arr, int target) {
        int n = arr.length;
        // Outer loop picks one element at a time
        for (int i = 0; i < n; i++) {
            // Inner loop searches for another element that complements arr[i]
            for (int j = i + 1; j < n; j++) {
                // If sum equals target, return the pair of indices
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // No such pair found
        return new int[]{-1, -1};
    }
}

public class SumOfTwoArray {

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {2, 6, 5, 8, 11};
        int target = 15;

        // Variant 1
        System.out.println(sol.twoSumExists(arr, target));

        // Variant 2
        int[] res = sol.twoSumIndices(arr, target);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
}
