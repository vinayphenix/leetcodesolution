public class LeetCode1348 {
    public int numberOfSteps(int num) {
        int i = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
                i++;
            } else {
                num = num - 1;
                i++;
            }
        }
        return i;
    }

}
