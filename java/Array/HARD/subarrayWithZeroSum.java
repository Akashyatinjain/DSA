
import java.util.ArrayList;
import java.util.List;

class subarrayWithZeroSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, 7, -7};
        System.out.println(subarrayWithZeroSum(arr));
    }

    public static int subarrayWithZeroSum(int[] arr) {
        int n = arr.length;
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    arrList.add(arr[j]);
                    arrList.add(arr[i]);
                }
            }
        }
        return arrList.size();
    }
}
