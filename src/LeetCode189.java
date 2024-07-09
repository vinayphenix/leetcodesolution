public class LeetCode189 {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int f = 0 ;
        int e = nums.length-1;
        int l =0;
        while (f<e) {
                l = nums[f];
                nums[f] = nums[e];
                nums[e] = l;
                e--;
                f++ ;
            System.out.println("Hello world!");
            }

        int f1 = 0 ;
        int e1 = k-1;
        while (f1<e1) {
            l = nums[f1];
            nums[f1] = nums[e1];
            nums[e1] = l;
            e1--;
            f1++ ;
            System.out.println("Hello world!");
        }

        int f2 = k ;
        int e2 = nums.length-1;
        while (f2<e2) {
            l = nums[f2];
            nums[f2] = nums[e2];
            nums[e2] = l;
            e2--;
            f2++ ;
            System.out.println("Hello world!");
        }
    }
}
