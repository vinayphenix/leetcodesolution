public class LeetCode1351 {
    public int countNegatives(int[][] grid) {

        int sum = 0;

        for (int[] arr : grid) {
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] < 0) {
                    sum = sum + (arr.length - i);
                    break;
                }
            }
        }
        return sum;
    }
}
