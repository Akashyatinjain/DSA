
class UpperLow {

    public int upperBound(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19};
        int x = 9;

        UpperLow finder = new UpperLow();
        int ind = finder.upperBound(arr, x);
        System.out.println("The upper bound is the index: " + ind);
    }
}
