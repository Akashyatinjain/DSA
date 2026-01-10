
public class Kadane {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, -2, 7, -4};

        // Create an instance of Solution class
        Solution sol = new Solution();

        int maxSum = sol.maximumSum(arr);

        // Print the max subarray sum
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}

class Solution {

    public int maxSubArray(int[] arr) {
        // int maxi = Integer.MIN_VALUE;;
        // for (int i = 0; i < arr.length; i++) {
        //     int sum = 0;
        //     for (int j = i; j < arr.length; j++) {

        //         sum += arr[j];
        //         maxi = Math.max(maxi, sum);
        //     }
        // }
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return (int) maxi;
    }

    public int maximumSum(int[] arr) {
        long maxi = Long.MIN_VALUE;
        int start = 0;
        int sum = 0;
        int ansStart = -1, ansEnd = -1;
        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += arr[i];
            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        // Return the maximum subarray sum found
        return (int) maxi;
    }
}
