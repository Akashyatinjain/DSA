
class GasStations {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int n = arr.length;
        int[] howMany = new int[n - 1];
        for (int i = 0; i < k; i++) {
            double maxSection = -1;
            int maxInd = -1;
            for (int j = 0; j < n - 1; j++) {
                double diff = arr[j + 1] - arr[j];
                double sectionLength = diff / (howMany[j] + 1.0);
                if (sectionLength > maxSection) {
                    maxSection = sectionLength;
                    maxInd = j;
                }
            }
            howMany[maxInd]++;
        }
        double maxAns = -1;
        for (int i = 0; i < n - 1; i++) {
            double diff = arr[i + 1] - arr[i];
            double sectionLength = diff / (howMany[i] + 1.0);
            maxAns = Math.max(maxAns, sectionLength);
        }
        System.err.println("the max is " + maxAns);
    }
}
