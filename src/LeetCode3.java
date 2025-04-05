import java.util.HashMap;
import java.util.Map;

public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
       
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            int count = 0;
            while (j<s.length() && map.get(s.charAt(j)) == null ) {
                map.put(s.charAt(j), 1);
                count++;
                j++;
            }
            if (count>max) {
                max=count;
            }
            map.clear();

        }
        return max;
      
        
    }
}
