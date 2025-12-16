public class LeetCode704 {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int mid = nums.length / 2;
        while (i <= j) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
            mid = (i + j) / 2;
        }
        return -1;

    }
}
