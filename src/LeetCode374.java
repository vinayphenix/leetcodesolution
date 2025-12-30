public class LeetCode374 {

    public int guessNumber(int n) {
        int num = n / 2;
        int i = 0;
        int g = Integer.MIN_VALUE;
        while (g != 0) {
//            g = guess(num);
            if (g == -1) {
                n = num - 1;

            } else if (g == 1) {
                i = num + 1;
            }
            num = i + (n - i) / 2;
        }
        return num;
    }
}
