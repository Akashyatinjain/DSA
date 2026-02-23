

public class LargestConsequtive {

    public static void main(String[] args) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        Solution sc = new Solution();
        int result = sc.largestArr(nums);
        System.err.println(result);
    }
}

class Solution {

    public int largestArr(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int longest = 1;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int cnt = 1;
            while (linersearch(nums, x + 1) == true) {
                x = x + 1;
                cnt = cnt + 1;
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public boolean linersearch(int[] nums, int x) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == x) {
                return true;
            }
        }
        return false;
    }
}
