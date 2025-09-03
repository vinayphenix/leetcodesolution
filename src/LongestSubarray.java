import java.util.HashMap;

public class LongestSubarray {
    public int longestSubarray(int[] arr, int k) {

        int prefix = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;

        for(int i = 0;i<arr.length;i++) {
            prefix = prefix + arr[i];

            if (prefix==k) {
                max=i+1;
            }

            else if(map.get(prefix-k)!=null) {
                 int length =i-map.get(prefix-k);
                 max = Math.max(max, length);
            } 
            
            if (!map.containsKey(prefix)) {
               map.put(prefix,i);
            }
        }
        return max;
    }

}
