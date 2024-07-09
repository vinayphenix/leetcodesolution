public class LeetCode577 {
    public String reverseWords(String s) {

        String[] array = s.split(" ");
        s = "";
        for (int i = 0; i < array.length; i++) {
            String s1 = array[i];
            for (int j = s1.length() - 1; j >= 0; j--) {
                s = s + String.valueOf(s1.charAt(j));
            }
            s = s + " ";
        }
        return s.substring(0,s.length()-1);

    }
}
