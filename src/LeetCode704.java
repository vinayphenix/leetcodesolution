public class LeetCode704 {
    public int search(int[] nums, int target) {
        int mid = nums.length / 2;
        int i = 0;
        int j = nums.length;
        int result = -1;

        while (i < j) {
            if (nums[mid] == target) {
                result = mid;
                break;
            } else if (target < nums[mid]) {
                j = mid;
                mid = (i + j) / 2;
            } else {
                i = mid+1;
                mid = (i + j) / 2;
            }

        }
        return result;

    }
}
