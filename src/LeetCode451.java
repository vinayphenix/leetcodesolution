import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LeetCode451 {

    public String frequencySort(String s) {

        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), String.valueOf(s.charAt(i)) + map.get(s.charAt(i)));
            } else {
                map.put(s.charAt(i), String.valueOf(s.charAt(i)));
            }
        }
        return map.entrySet().stream().sorted((e1, e2) -> e2.getValue().length() - e1.getValue().length())
                .map(e -> e.getValue()).collect(Collectors.joining());

    }
}
