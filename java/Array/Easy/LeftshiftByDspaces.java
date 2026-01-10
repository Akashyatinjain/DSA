
// class LeftshiftByDspaces {
//     public static void main(String[] args) {
//         int arr[] = {8, 1, 3, 8, 2, 4, 6, 1, 0, 5, 6};
//         int n = arr.length;
//         // int temp = arr[0];
//         int k = 3;
//         while (k-- > 0) {
//             int temp = arr[0];
//             for (int i = 1; i <= n - 1; i++) {
//                 arr[i - 1] = arr[i];
//             }
//             arr[n - 1] = temp;
//         }
//         // samArr[n - 1] = temp;
//         // int k = k % n;
//         for (int i = 0; i <= n - 1; i++) {
//             System.err.print(arr[i] + " ");
//         }
//     }
// }
class solution {

    // Function to reverse part of the array between given indices
    void reverseArray(int[] nums, int start, int end) {
        // Swap elements until start meets end
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate array left or right by k steps
    public int[] rotateArray(int[] nums, int k, String direction) {
        // Get array length
        int n = nums.length;

        // Edge case: do nothing if array is empty or k is 0
        if (n == 0 || k == 0) {
            return nums;
        }

        // Normalize k if greater than n
        k = k % n;

        // If rotation is to the right
        if (direction.equals("right")) {
            // Step 1: reverse entire array
            reverseArray(nums, 0, n - 1);

            // Step 2: reverse first k elements
            reverseArray(nums, 0, k - 1);

            // Step 3: reverse remaining n-k elements
            reverseArray(nums, k, n - 1);
        } // If rotation is to the left
        else if (direction.equals("left")) {
            // Step 1: reverse first k elements
            reverseArray(nums, 0, k - 1);

            // Step 2: reverse remaining n-k elements
            reverseArray(nums, k, n - 1);

            // Step 3: reverse entire array
            reverseArray(nums, 0, n - 1);
        }

        // Return the rotated array
        return nums;
    }
}

// Driver code
public class LeftshiftByDspaces {

    public static void main(String[] args) {
        // Create instance of Solution
        solution sol = new solution();

        // Input array and parameters
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        String direction = "right";

        // Call rotateArray and store result
        int[] result = sol.rotateArray(nums, k, direction);

        // Print rotated array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
