
import java.util.Vector;

class mergesort {

    public static void main(String[] args) {
        int arr[] = {8, 9, 7, 2, 0, 2, 1, 3};
        mergesort(arr, 0, arr.length - 1);
        for (int i = 0; i <= arr.length - 1; i++) {
            System.err.println(arr[i]);
        }
    }

    public static void mergesort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergesort(arr, start, mid);
        mergesort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int arr[], int start, int mid, int end) {
        Vector<Integer> temp = new Vector<>();
        int i = start;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }
        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }
        while (j <= end) {
            temp.add(arr[j]);
            j++;
        }
        for (int idx = 0; idx < temp.size(); idx++) {
            arr[start + idx] = temp.get(idx);
        }

    }
}
