import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int i = 0;
        for (; i < nums.length; i++) {
            if (numMap.containsKey(target - nums[i])) {
                return new int[]{numMap.get(target - nums[i]), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
