
class NthRoot {

    public static void main(String[] args) {
        int m = 27;
        int n = 3;
        for (int i = 1; i <= m; i++) {
            long power = (long) Math.pow(i, n);
            if (power == m) {
                System.err.println("Answer is " + i);
            }
            if (power > m) {
                break;
            }
        }
    }
}
