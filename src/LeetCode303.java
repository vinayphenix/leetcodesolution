public class LeetCode303 {

    int[] nums;

    public LeetCode303(int[] nums) {

        for (int i = 1; i < nums.length; i++) {

            nums[i] = nums[i] + nums[i - 1];

        }
        this.nums = nums;
    }

    public int sumRange(int left, int right) {

        if (left == 0) {
            return nums[right];
        } else {
            return nums[right] - nums[left - 1];
        }

    }
}
