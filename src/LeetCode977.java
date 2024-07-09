public class LeetCode977 {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int j = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            nums[i]= nums[i] * nums[i];
            if(i+1< nums.length && nums[i]>nums[i+1]) {
                j=i;
                while (j+1< nums.length &&nums[j]>nums[j+1] ) {
                    l = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = l;
                    j++;
                }
            }

        }

        return nums;
    }
}
