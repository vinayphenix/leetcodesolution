import java.util.HashMap;

public class TwoDIstantIntegers {
    // {1, 1, 5, 6, 7, 8, 9
    public int totalElements(int[] arr) {
        // code here
        int p2 = 1;
        int size = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int p1 = 0; p1 < arr.length; p1++) {
            int temp = 0;
            map.put(arr[p1], 0);
            p2 = p1;
            while (p2 < arr.length) {
                map.put(arr[p2], 0);
                p2++;
                if (map.size() > 2) {
                    break;
                }
                temp++;

            }
            map.clear();
            size = Math.max(size, temp);

        }
        return size;
    }
}
