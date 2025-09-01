public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int pos = 0;
        int temp = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                nums[i - 1] = 101;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 101) {
                temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
                pos++;
            }
        }

        return pos;
    }

}
