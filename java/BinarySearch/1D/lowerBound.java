
class lowerBound {

    public static int LowerBound(int[] nums, int x) {
        int n = nums.length;
        int var = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= x) {
                var = i;
                return i;
            }
        }
        return var;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 8, 15, 19};
        int x = 9;
        int sys = LowerBound(nums, x);
        System.out.println(sys);
    }
}
