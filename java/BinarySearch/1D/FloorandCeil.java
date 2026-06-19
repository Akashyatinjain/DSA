
class FloorandCeil {

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int target = 5;
        int floor = floor(arr, target);
        int ceil = ceil(arr, target);
        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);
    }

    public static int floor(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int floor = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return floor;
    }

    public static int ceil(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ceil = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                ceil = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ceil;
    }
}
