
import java.util.HashMap;
import java.util.Map;

class subarraysWithGivenXORK {

    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 6, 4};
        int k = 6;
        int n = arr.length;
        // int cnt = 0;
        // for (int i = 0; i < n; i++) {
        //     int xor = 0;
        //     for (int j = i; j < n; j++) {
        //         xor = xor ^ arr[j];
        //         if (xor == k) {
        //             cnt++;
        //         }
        //     }
        // }
        // System.err.println(cnt);

        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);
        int crtPrefix = 0;
        int cnt = 0;
        for (int num : arr) {
            crtPrefix ^= num;
            int target = crtPrefix ^ k;
            if (mpp.containsKey(target)) {
                cnt = cnt + mpp.get(target);
            }
            mpp.put(crtPrefix, mpp.getOrDefault(crtPrefix, 0) + 1);
        }
        System.err.println(mpp.size());
    }
}
