import java.util.Arrays;

public class LeetCode567 {
    public boolean checkInclusion(String s1, String s2) {
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        int x ;
        int i = 0;

        for (; i < s1.length(); i++) {
            x = s1.charAt(i) - 97;
            array2[x] = array2[x] + 1;
        }
//        Arrays.stream(array2).forEach(System.out::print);

        for (int k = 0; k + s1.length() - 1 < s2.length(); k++) {


            for (int l = k; l <= k + s1.length() - 1; l++) {
                x = s2.charAt(l) - 97;
                array1[x] = array1[x] + 1;
            }
            System.out.println(Arrays.equals(array1, array2));
            if (Arrays.equals(array1, array2)) return true;
            Arrays.fill(array1,0);
        }

        return false;
    }
}
