
import java.util.*;

class Painter {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int k = 2;
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        int result = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (cntPainter(arr, mid) <= k) {
                high = mid - 1;
                result = mid;
            } else {
                low = mid + 1;
            }
        }
        System.err.println("the mid is " + low);
    }

    public static int cntPainter(int[] arr, int mid) {
        int paint = 1;
        int cnt = 0;
        for (int no : arr) {
            if (cnt + no <= mid) {
                cnt += no;
            } else {
                paint++;
                cnt = no;
            }
        }
        return paint;
    }
}
