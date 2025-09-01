public class LeetCode485 {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                if (max < count) {
                    max = count;
                }
                count = 0;
            }
        }
        return max < count ? count : max;
    }
}
