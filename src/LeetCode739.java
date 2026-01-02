import java.util.LinkedList;

public class LeetCode739 {

    public int[] dailyTemperatures(int[] temperatures) {

        int[] ans = new int[temperatures.length];

        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < temperatures.length; i++) {

            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int index = stack.pop();
                ans[index] = i - index;

            }
            stack.push(i);
        }
        return ans;
    }
}
