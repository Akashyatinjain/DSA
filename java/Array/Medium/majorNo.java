
public class majorNo {

    public static void main(String[] args) {
        int nums[] = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        int n = nums.length;
        solution sc = new solution();
        System.err.println("The Largest occuring number is " + sc.Major(nums, n));
    }
}

class solution {

    public int Major(int[] nums, int n) {
        // for (int i = 0; i < n; i++) {
        //     int cnt = 0;
        //     for (int j = 0; j < n; j++) {
        //         if (nums[i] == nums[j]) {
        //             cnt++;
        //         }
        //     }
        //     if (cnt > (n / 2)) {
        //         return nums[i];
        //     }
        // }

        //           HashMap 
        // HashMap<Integer, Integer> map = new HashMap<>();  
        // for (int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        // for (Map.Entry<Integer, Integer> e : map.entrySet()) {
        //     if (e.getValue() > (n / 2)) {
        //         return e.getKey();
        //     }
        // }
        //           Normal conditions 
        int cnt = 0;
        int el = 0;
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (el == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        int cnt1 = 0;
        for (int j = 0; j < n; j++) {
            if (el == nums[j]) {
                cnt1++;
            }
        }

        if (cnt1 > (n / 2)) {
            return el;
        }

        return -1;
    }
}
