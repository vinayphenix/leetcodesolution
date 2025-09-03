public class LeetCode35 {
    public int searchInsert(int[] nums, int target) {
        int mid = nums.length / 2;
        int i = 0;
        int j = nums.length;

        while (i < j) {
            if (nums[mid] == target) {
                break;
            } else if (target < nums[mid]) {
                j = mid;
                mid = (i + j) / 2;
            } else {
                i = mid + 1;
                mid = (i + j) / 2;
            }

        }
        return mid;
    }
}
