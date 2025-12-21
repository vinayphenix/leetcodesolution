public class LeetCode1021 {

    public String removeOuterParentheses(String s) {
        int count = 0;

        int pos = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                res.append(s.substring(pos + 1, i));
                pos = i + 1;
            }

        }

        return res.toString();
    }
}
