public class LeetCode11 {
    public int maxArea(int[] height) {

        int i = 0;
        int j = height.length - 1;
        int fill = 0;
        while (i < j) {

            if (fill < (j - i) * (Math.min(height[i], height[j]))) {
                fill = (j - i) * (Math.min(height[i], height[j]));
            }

            if(height[i]>height[j]){
                j--;
            } else{
                i++;
            }

        }
        return fill;
    }
}
