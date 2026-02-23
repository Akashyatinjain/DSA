
public class SetZeroMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        Solution sc = new Solution();
        int[][] result = sc.SetZero(matrix);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

class Solution {

    // public int[][] SetZero(int arr[][]) {
    //     int m = arr.length;
    //     int n = arr[0].length;
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (arr[i][j] == 0) {
    //                 for (int col = 0; col < n; col++) {
    //                     if (arr[i][col] != 0) {
    //                         arr[i][col] = -1;
    //                     }
    //                 }
    //                 for (int row = 0; row < m; row++) {
    //                     if (arr[row][j] != 0) {
    //                         arr[row][j] = -1;
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (arr[i][j] == -1) {
    //                 arr[i][j] = 0;
    //             }
    //         }
    //     }
    //     return arr;
    // }
    public int[][] SetZero(int arr[][]) {
        int m = arr.length;  // row
        int n = arr[0].length; // columns

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}
