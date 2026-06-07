
class subarrayWithSumK {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 7, 5};
        int k = 12;
        System.out.println(subarrayWithSumK(nums, k));
    }

    public static int subarrayWithSumK(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }
}
