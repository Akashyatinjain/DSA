
class Solution {

    public int[] sort(int[] arr, int n) {
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (arr[i] > arr[j]) {
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for (int num : arr) {
            if (num == 0) {
                cnt0++;
            } else if (num == 1) {
                cnt1++;
            } else {
                cnt2++;
            }
        }
        // int index = 0;
        // while (cnt0-- > 0) {
        //     arr[index++] = 0;
        // }
        // while (cnt1-- > 0) {
        //     arr[index++] = 1;
        // }
        // while (cnt2-- > 0) {
        //     arr[index++] = 2;
        // }

        for (int i = 0; i < cnt0; i++) {
            arr[i] = 0;
        }
        for (int i = cnt0; i < cnt0 + cnt1; i++) {
            arr[i] = 1;
        }
        for (int i = cnt1 + cnt0; i < arr.length; i++) {
            arr[i] = 2;
        }
        return arr;
    }
}

public class SortZOT {

    public static void main(String[] args) {
        Solution sc = new Solution();
        int arr[] = {1, 0, 2, 1, 0};
        int n = arr.length;

        int[] nums = sc.sort(arr, n);

        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}
