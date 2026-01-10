
class largestNumber {

    public static void main(String[] args) {
        int arr[] = {74, 52, 41, 00, 36, 99, 456, 71, 4, 5, 0, 6, 2};
        int Big = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (Big < arr[i]) {
                Big = arr[i];
            }
        }
        System.err.println("The bigest number is :" + Big);
    }
}
