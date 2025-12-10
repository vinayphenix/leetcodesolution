public class LeetCode1925 {

    public int countTriples(int n) {
        int count = 0;
        int square = 0;
        for (int num = n; num > 1; num--) {

            square = num * num;
            int i = 1;
            int j = num - 1;
            while (i < j) {
                if (i * i + j * j == square) {
                    count++;
                    i++;
                } else if (i * i + j * j > square) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count == 0 ? 0 : count * 2;
    }

}
