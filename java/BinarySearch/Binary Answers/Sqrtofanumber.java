
class Sqrtofanumber {

    public static void main(String[] args) {
        int n = 28;
        int ans = 0;
        // for (int i = 1; i < n; i++) {
        //     if ((long) (i) * i <= n) {
        //         ans = i;
        //     } else {
        //         break;
        //     }
        // }
        // System.err.println("the square root is : " + ans);
        if (n < 2) {
            ans = 2;
        }
        int left = 1;
        int right = n / 2;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (mid * mid <= n) {
                ans = (int) mid;
                left = (int) mid + 1;
            } else {
                right = (int) mid - 1;
            }
        }
        System.err.println("the square root is : " + ans);
    }
}
