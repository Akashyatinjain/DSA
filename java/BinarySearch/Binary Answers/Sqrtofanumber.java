
class Sqrtofanumber {

    public static void main(String[] args) {
        int n = 28;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if ((long) (i) * i <= n) {
                ans = i;
            } else {
                break;
            }
        }
        System.err.println("the square root is : " + ans);
    }
}
