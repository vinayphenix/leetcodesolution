import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LeetCode2259 {
    public String removeDigit(String number, char digit) {

        char[] arr = number.toCharArray();
        List<String> set = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == digit) {

                set.add(number.substring(0, i).concat(number.substring(i + 1, number.length())));
            }
        }
        Collections.sort(set);
        return set.get(set.size() - 1);
    }
}
