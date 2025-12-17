public class LeetCode169 {

    public int majorityElement(int[] nums) {

        int ele = 0;
        int majority = 0;
        for (int num : nums) {
            if (num == ele) {
                majority++;
            } else {
                if (majority == 0) {
                    ele = num;
                } else {
                    majority--;
                }
            }
        }
        return ele;
    }

}
