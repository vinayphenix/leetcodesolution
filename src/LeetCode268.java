public class LeetCode268 {

    public int missingNumber(int[] nums) {

        int num = 0;
        int pos = 0;
        int temp = 0;
        while (pos < nums.length) {
            if (nums[pos] == num) {
                temp = nums[num];
                nums[num] = nums[pos];
                nums[pos] = temp;
                pos = num + 1;
                num = num + 1;
            } else {
                pos++;
            }
        }
        return num;
    }

}
