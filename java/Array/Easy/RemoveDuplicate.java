
class RemoveDuplicate {

    public static void main(String[] args) {
        int Nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        // int index = 0;
        // Set<Integer> seen = new HashSet<>();
        // for (int no : Nums) {
        //     if (!seen.contains(no)) {
        //         seen.add(no);
        //         Nums[index] = no;
        //         index++;
        //     }
        // }
        // System.err.println(seen);
        int i = 0;
        for (int j = 0; j < Nums.length; j++) {
            if (Nums[j] != Nums[i]) {
                i++;
                Nums[i] = Nums[j];
            }
        }
        for (int k = 0; k < i + 1; k++) {
            System.err.println(Nums[k]);
        }
    }
}
