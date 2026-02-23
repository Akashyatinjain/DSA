
import java.util.ArrayList;
import java.util.List;

public class Leader {

    public static void main(String[] args) {
        int nums[] = {4, 7, 1, 0};
        Solution sc = new Solution();
        sc.Number(nums);
    }
}

class Solution {

    public void Number(int[] nums) {
        int minNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minNum) {
                minNum = nums[i];
            }
        }
        List<Integer> Map = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                Map.add(nums[i]);
            }
        }
        System.err.println("The Array is ");
        for (int j = 0; j < Map.size(); j++) {
            System.err.print(Map.get(j));
        }
    }
}
