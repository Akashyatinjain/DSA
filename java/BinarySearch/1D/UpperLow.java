
class UpperLow {

    public static int UpperBound(int[] nums, int x) {
        int n = nums.length;
        int var = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= x) {
                var = i;
            }
        }
        return var;
        // int low = 0;
        // int high = n - 1;
        // int var = n;
        // while (low <= high) {
        //     int mid = (low + high) / 2;
        //     if (nums[mid] > x) {
        //         var = mid;
        //         high = mid - 1;
        //     } else {
        //         low = mid + 1;
        //     }
        // }
        // return var;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 8, 15, 19};
        int x = 9;
        int sys = UpperBound(nums, x);
        System.out.println(sys);
    }
}
