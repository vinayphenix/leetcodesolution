import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UnionOfSortedArray {


//    nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]
    public static ArrayList<Integer> unionArray(int[] nums1, int[] nums2) {

        Set<Integer> set = new TreeSet<>();
        set.addAll(Arrays.stream(nums1).boxed().toList());
        set.addAll(Arrays.stream(nums2).boxed().toList());
        return new ArrayList<>(set);

    }
}
