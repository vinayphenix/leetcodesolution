public class LeetCode167 {
    public int[] twoSum(int[] numbers, int target) {

        int f = 0;
        int l = numbers.length - 1;
        while (f<l) {
            if (numbers[f] + numbers[l] == target) {
                break;
            }
            if  (numbers[f] + numbers[l] > target) {
                l--;
            } else {
                f++;
            }
        }

        return new int[] {f+1,l+1};
    }
}
