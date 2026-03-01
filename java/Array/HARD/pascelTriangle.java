
import java.util.*;

class Solution {

    // to get the pasacel triangle
    // public List<Long> generate(int numRows) {
    //     List<Long> triangle = new ArrayList<>();
    //     for (int i = 0; i < numRows; i++) {
    //         Long rows = new ArrayList<>(Collections.nCopies((i + 1), 1));
    //         for (int j = 1; j < i; j++) {
    //             rows.set(j, triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
    //         }
    //         triangle.add(rows);
    //     }
    //     return triangle;
    // }
    // get a perticullar row
    public List<Integer> generate(int N) {

        List<Integer> row = new ArrayList<>();
        long val = 1;

        row.add((int) val);

        for (int i = 1; i <= N; i++) {
            val = val * (N - i + 1) / i;
            row.add((int) val);
        }

        return row;
    }
}

public class pascelTriangle {

    public static void main(String[] args) {
        int N = 5; // Example: 5th row
        Solution sol = new Solution();
        List<Integer> result = sol.generate(N);

        // Print the row
        for (long num : result) {
            System.out.print(num + " ");
        }
    }
}
