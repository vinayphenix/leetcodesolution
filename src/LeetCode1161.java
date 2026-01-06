import java.util.ArrayList;
import java.util.List;

public class LeetCode1161 {

    int count = 1;
    List<Integer> list = new ArrayList<>();

    public int maxLevelSum(TreeNode root) {

        if (root == null) {
            return 0;
        }

        inorder(root, count);

        int maxSum = Integer.MIN_VALUE;
        int level = 1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxSum) {
                maxSum = list.get(i);
                level = i + 1; // level starts from 1
            }
        }

        return level;
    }

    void inorder(TreeNode root, int count) {
        if (root == null) {
            return;
        }

        // If this level is visited first time
        if (list.size() < count) {
            list.add(root.val);
        } else {
            list.set(count - 1, list.get(count - 1) + root.val);
        }

        inorder(root.left, count + 1);
        inorder(root.right, count + 1);
    }
}
