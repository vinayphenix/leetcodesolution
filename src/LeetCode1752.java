import java.util.Arrays;
import java.util.stream.IntStream;

public class LeetCode1752 {

    public boolean check(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int lenght = 1;

        int nums2[] = IntStream.concat(Arrays.stream(nums), Arrays.stream(nums)).toArray();

        for (int i = 1; i < nums2.length; i++) {
            if (nums2[i - 1] <= nums2[i]) {
                lenght++;
                if (lenght == nums.length) {
                    return true;
                }
            } else {
                lenght = 1;
            }
        }

        return false;

    }

}
