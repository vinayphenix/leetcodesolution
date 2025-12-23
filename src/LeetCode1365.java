import java.util.ArrayList;
import java.util.List;

public class LeetCode1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        list.sort((a,b)->a-b);
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = list.indexOf(nums[i]);
        }
        return ans;

    }

}
