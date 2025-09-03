import java.util.HashMap;

public class LongestSubarraywithzero {

    public int maxLength(int arr[]) {
        // code here

        int prefix = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        map.put(0, -1);


        for(int i = 0;i<arr.length;i++) {
            prefix = prefix + arr[i];

            if (map.get(prefix)==null) {
                map.put(prefix,i);
            } else {
                int length =i-map.get(prefix);
                max = Math.max(max, length);
            }
        }
        return max;
    }
    
}
