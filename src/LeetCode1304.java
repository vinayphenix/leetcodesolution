public class LeetCode1304 {

    public int[] sumZero(int n) {

        int[] num = new int[n];

        for (int i = 1; i < num.length; i++) {
            num[0] += i;
            num[i] = i * (-1);
        }

        return num;

    }
}
