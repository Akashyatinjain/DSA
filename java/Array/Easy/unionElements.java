
import java.util.*;

class solution {

    public List<Integer> findunion(int[] arr1, int[] arr2, int n, int m) {
        //          Tree MAp

        // TreeMap<Integer, Integer> freq = new TreeMap<>();
        // for (int i = 0; i < n; i++) {
        //     freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
        // }
        // for (int i = 0; i < m; i++) {
        //     freq.put(arr2[i], freq.getOrDefault(arr2[i], 0) + 1);
        // }
        // List<Integer> union = new ArrayList<>();
        // for (int key : freq.keySet()) {
        //     union.add(key);
        // }
        // return union;
        //          Tree SET
        Set<Integer> st = new TreeSet<>();
        for (int num : arr1) {
            st.add(num);
        }
        for (int num : arr2) {
            st.add(num);
        }
        return new ArrayList<>(st);

    }

}

public class unionElements {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length;
        int m = arr2.length;
        solution obj = new solution();
        List<Integer> Union = obj.findunion(arr1, arr2, n, m);
        // Print output message
        System.out.println("Union of arr1 and arr2 is ");
        // Print all elements of union
        for (int val : Union) {
            System.out.print(val + " ");
        }
    }
}
