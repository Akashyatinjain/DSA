
class HowManyTimeRotate {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int minIndex = 0;
        // int minVal = arr[0];
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] < minVal) {
        //         minVal = arr[i];
        //         minIndex = i;
        //     }
        // }
        // System.err.println("Rotated arr times is" + minIndex);
        //----------------------------------------------------------------
        //             OR
        //----------------------------------------------------------------
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                minIndex = i + 1;
            }
        }
        System.err.println("Rotated arr times is" + minIndex);
    }
}
