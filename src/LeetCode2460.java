public class LeetCode2460 {
    public int[] applyOperations(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                nums[i - 1] = nums[i - 1] * 2;
                nums[i] = 0;
            }
        }
        int temp = 0;
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
                pos++;
            }
        }
        return nums;
    }
}
