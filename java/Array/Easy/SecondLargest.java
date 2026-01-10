
class SecondLargest {

    public static void main(String[] args) {
        int arr[] = {7, 8, 1, 4, 5, 9, 3, 1, 0};
        //            INSERTION SORT
        // for (int i = 1; i < arr.length - 1; i++) {
        //     int startValue = arr[i];
        //     int j = i - 1;
        //     while (j >= 0 && arr[j] > startValue) {
        //         arr[j + 1] = arr[j];
        //         j--;
        //     }
        //     arr[j + 1] = startValue;
        // }
        // for (int idx = 0; idx < arr.length - 1; idx++) {
        //     System.err.println(" " + arr[idx]);
        // }

        //            SELECTION SORT
        // for (int i = 0; i < arr.length - 1; i++) {
        //     int minIndex = i;
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[j] < arr[minIndex]) {
        //             minIndex = j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[minIndex];
        //     arr[minIndex] = temp;
        // }
        // for (int idx = 0; idx < arr.length - 1; idx++) {
        //     System.err.println(" " + arr[idx]);
        // }
        //           BETTER APPROCH
        // int small = Integer.MAX_VALUE;
        // int second_small = Integer.MAX_VALUE;
        // int large = Integer.MIN_VALUE;
        // int second_large = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        //     small = Math.min(small, arr[i]);
        //     large = Math.max(large, arr[i]);
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] < second_small && arr[i] != small) {
        //         second_small = arr[i];
        //     }
        //     if (arr[i] > second_large && arr[i] != large) {
        //         second_large = arr[i];
        //     }
        // }
        // System.out.println("Second smallest is " + second_small);
        // System.out.println("Second largest is " + second_large);
        //          OPTIMAL APPROCH
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];KO
            } else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            } else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }
        System.out.println("Second smallest is " + second_small);
        System.out.println("Second largest is " + second_large);
    }
}
