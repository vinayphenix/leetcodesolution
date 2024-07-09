public class LeetCode344 {
    public void reverseString(char[] s) {
            int f = 0;
            int l = s.length-1;
            char temp = ' ';
            while(f<l) {
                temp = s[f];
                s[f] = s[l];
                s[l] = temp;
                f++;
                l--;
            }
    }
}
