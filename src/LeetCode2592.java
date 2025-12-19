public class LeetCode2592 {
    public int maximumCount(int[] nums) {

        int i = 0;
        int j = nums.length - 1;
        int mid = (i + j) / 2;
        int pos = 0;
        int neg = 0;

        while (i <= j) {
            if (nums[mid] == 0) {
                break;
            } else if (nums[mid] > 0) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
            mid = (i + j) / 2;
        }

        if (nums[mid] < 0) {
            neg = mid + 1;
            pos = nums.length - mid - 1;
            return Math.max(neg, pos);
        } else if (nums[mid] > 0) {
            return nums.length;
        } else {
            i = mid - 1;
            j = mid + 1;

            while (j < nums.length && nums[j] == 0) {
                j++;
            }

            while (i > 0 && nums[i] == 0) {
                i--;
            }

            neg = i == 0 ? i : i + 1;
            pos = nums.length - 1 - (j - 1);
            return Math.max(neg, pos);
        }

    }
}
