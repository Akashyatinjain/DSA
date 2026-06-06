
class Solution {

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int n = nums.length;

        int var = n / 3;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    cnt++;
                }
            }

            if (cnt > var && !arr.contains(nums[i])) {
                arr.add(nums[i]);
            }
        }

        return arr;
    }
}
