public class LeetCode66 {
    public int[] plusOne(int[] digits) {

        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }
        int i = digits.length - 1;
        int extra = 1;
        for (; i >= 0; i--) {
            if (digits[i] + extra == 10) {
                digits[i] = 0;
                extra = 1;
            } else {
                digits[i] = digits[i] + extra;
                extra = 0;
                break;
            }
        }
        if (extra == 0) {
            return digits;
        } else {
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }

    }
}
