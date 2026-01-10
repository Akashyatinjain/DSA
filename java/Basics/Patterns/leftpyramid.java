
public class leftpyramid {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            char ch = 'A';
            for (ch = (char) (int) ('A' + n - i - 1); ch <= (char) (int) ('A' + n - 1); ch++) { // int t char convert 
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
