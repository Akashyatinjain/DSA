
import java.util.*;

class Solution {

    static ArrayList<Integer> union(int[] a, int[] b, int n, int m) {

        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                add(res, a[i]);
                i++;
            } else if (a[i] > b[j]) {
                add(res, b[j]);
                j++;
            } else {   // a[i] == b[j]
                add(res, a[i]);
                i++;
                j++;
            }
        }

        // remaining elements
        while (i < a.length) {
            add(res, a[i]);
            i++;
        }

        while (j < b.length) {
            add(res, b[j]);
            j++;
        }

        return res;
    }

    static void add(ArrayList<Integer> res, int val) {
        if (res.size() == 0 || res.get(res.size() - 1) != val) {
            res.add(val);
        }
    }
}

public class unionWhile {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int b[] = {2, 3, 4, 4, 5, 11, 12};
        int n = a.length;
        int m = b.length;
        Solution obj = new Solution();
        ArrayList<Integer> res = obj.union(a, b, n, m);
        // Print output message
        System.out.println("Union of arr1 and b is ");
        // Print all elements of union
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
