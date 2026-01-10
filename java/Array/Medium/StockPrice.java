
public class StockPrice {

    public static void main(String[] args) {
        int nums[] = {7, 1, 5, 3, 6, 4};
        Solution sol = new Solution();

        int maxSum = sol.StockCal(nums);
        System.out.println("The maximum subnumsay sum is: " + maxSum);
    }
}

class Solution {

    public int StockCal(int[] nums) {
        // int maxProfit = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         int profit = nums[j] - nums[i];
        //         // Update max profit if higher
        //         maxProfit = Math.max(maxProfit, profit);
        //     }
        // }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : nums) {
            // If current price is less than minPrice, update minPrice
            if (price < minPrice) {
                minPrice = price;
            } // Else calculate profit and update maxProfit if it's greater
            else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
}
