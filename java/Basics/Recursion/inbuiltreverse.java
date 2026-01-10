
import java.util.Arrays;
import java.util.Collections;

class inbuiltreverse {

    static void revser(Integer arr[]) {
        Collections.reverse(Arrays.asList(arr));
    }

    public static void main(String[] args) {
        Integer arr[] = {1, 2, 3, 4};
        revser(arr);
        for (int i = 0; i < arr.length; i++) {
            System.err.println("The arr is" + arr[i]);
        }
    }
}
