public class LeetCode278 {
    public int firstBadVersion(int n) {

        int i = 1;
        int j = n;
        int mid = i + (j - i) / 2;

        if (n == 1) {
            return n;
        }
        while (i < j) {

            if (!isBadVersion(mid)) {
                i = mid + 1;
            } else {
                j = mid;
            }
            mid = i + (j - i) / 2;
        }
        return mid;
    }

    boolean isBadVersion(int version) {
        return (version >=1240808008) ? true : false;
    }

}
