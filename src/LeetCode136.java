public class LeetCode136 {
    public int singleNumber(int[] nums) {
        int uniqNum = 0;
        // TRaverse all elements through the loop...
        for (int idx : nums) {
            // Concept of XOR...
            System.out.println("Current number: " + idx + " XOR with: " + uniqNum + " = " + (uniqNum ^ idx));
            uniqNum = uniqNum ^ idx;
        } return uniqNum; 
    }
}
