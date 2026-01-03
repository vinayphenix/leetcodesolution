public class LeetCode104 {

    int max = 0;

    public int maxDepth(TreeNode root) {
        inorder(root, 1);
        return max;
    }

    void inorder(TreeNode root, int count) {
        if (root == null) {
            return;
        }
        max = Math.max(max, count);

        count++;
        inorder(root.left, count);
        inorder(root.right, count);

    }
}
