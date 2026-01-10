
class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {1, 8, 2, 9, 3, 7, 1, 5, 3, 1, 0, 3, 0};
        int key = 9;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.err.println("The number is found");
                break;
            } else {
                System.err.println(-1);
            }
        }
    }
}
