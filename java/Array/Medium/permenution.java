
import java.util.*;

public class permenution {

    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        Solution sc = new Solution();
        List<Integer> res = sc.perCom(nums);
        for (int no : res) {
            System.err.println(no + " ");
        }
    }
}

class Solution {

    public List<Integer> perCom(int[] nums) {
        List<List<Integer>> all = new ArrayList<>();
        Arrays.sort(nums);
        permute(nums, 0, all);
    }

    public void permute(int[] nums, int start, List<List<Integer>> all) {
        if ()
    }
}
