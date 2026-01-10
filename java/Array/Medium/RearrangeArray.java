
public class RearrangeArray {

    public static void main(String[] args) {
        int[] A = {1, 2, -4, -5};
        int n = A.length;

        ArrayManipulator obj = new ArrayManipulator();
        int[] result = obj.rearrangeBySign(A, n);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

class ArrayManipulator {

    public int[] rearrangeBySign(int[] arr, int n) {

        // List<Integer> pos = new ArrayList<>();
        // List<Integer> neg = new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] > 0) {
        //         pos.add(arr[i]);
        //     } else {
        //         neg.add(arr[i]);
        //     }
        // }
        // for (int i = 0; i < n / 2; i++) {
        //     arr[2 * i] = pos.get(i);
        //     arr[2 * i + 1] = neg.get(i);
        // }
        int[] newarr = new int[arr.length];
        int pos = 0, neg = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                newarr[neg] = arr[i];
                neg += 2;
            } else {
                newarr[pos] = arr[i];
                pos += 2;
            }
        }
        return newarr;
    }
}
