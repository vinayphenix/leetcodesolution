public class LeetCode35 {
    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        int tip = nums.length / 2;
        while (tip > 0 || tip <= nums.length) {
            if (first>last) {
                break;
            }
            if (nums[tip] == target) {
                return tip;
            } else if (nums[tip] < target) {
                first = tip + 1;
                last = last ;
                tip = (first + last) / 2;
            } else {
                first = first;
                last = tip - 1;
                tip = (first + last) / 2;
            }
        }
        return first;
    }
}
