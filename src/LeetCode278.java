public class LeetCode278 {
    public int firstBadVersion(int n) {
        if (n == 1) {
            return n;
        }
        if (isBadVersion(1)) {
            return 1;
        }
        if (isBadVersion(n) && !isBadVersion(n - 1)) {
            return n;
        }
        int first = 1;
        int last = n;
        int tip = n / 2;
        while (true) {
            if (isBadVersion(tip) && !isBadVersion(tip - 1)) {
                return tip;
            } else if (!isBadVersion(tip)) {
                first = tip + 1;
                last = last;
                tip = (first + last) / 2;
                if (tip < 0) {
                    tip = tip + Integer.MAX_VALUE + 1;
                }
            } else if (first == last) {
                return first - 1;
            } else {
                first = first;
                last = tip - 1;
                tip = (first + last) / 2;
                if (tip < 0) {
                    tip = tip + Integer.MAX_VALUE + 1;
                }
            }

        }
    }

    boolean isBadVersion(int version) {
        return (version >=1240808008) ? true : false;
    }

}
