import java.util.Stack;

public class LeetCode1249 {

    public String minRemoveToMakeValid(String s) {

        char[] arr = s.toCharArray();
        Stack<Integer[]> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(new Integer[]{-100, i});
            }

            if (arr[i] == ')') {
                if (!stack.isEmpty() && stack.peek()[0] == -100) {
                    stack.pop();
                } else {
                    stack.push(new Integer[]{-200, i});
                }
            }
        }

        while (!stack.isEmpty()) {

            Integer[] curr = stack.pop();
            arr[(int) curr[1]] = '*';
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '*') {
                sb.append(arr[i]);
            }
        }
        return sb.toString();

    }
}
