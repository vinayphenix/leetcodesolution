import java.util.Arrays;

public class LeetCode645 {

    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        int dup = 0;
        Arrays.sort(nums);
        int sum2 = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum2 += nums[i];
            if (nums[i] == nums[i - 1]) {
                dup = nums[i];
            }
        }
        return new int[] { dup, sum - (sum2 - dup) };
    }


}
