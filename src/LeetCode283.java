import java.util.Arrays;

public class LeetCode283 {
    public void moveZeroes(int[] nums) {
        int f = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0) {
                nums[f]=nums[i];
                f++;
            }
        }

        System.out.println();
        for (; f < nums.length; f++) {
            nums[f]=0;
        }

    }
}



