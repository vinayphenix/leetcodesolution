public class LeetCode33 {

    public int search(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;
        int mid = i + (j - i) / 2;

        while (i <= j) {

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[i] <= nums[mid]) {
                if (nums[i] <= target && target <= nums[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }

            } else if (nums[mid] <= nums[j]) {
                if (nums[mid] <= target && target <= nums[j]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }

            mid = i + (j - i) / 2;
        }
        return -1;
    }
}
