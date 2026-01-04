public class LeetCode110 {

    boolean check  = true;
    public boolean isBalanced(TreeNode root) {
        heigth(root);
        return check;
    }

    int heigth(TreeNode root) {
        if (root==null){
            return 0;
        }

        int left = heigth(root.left);
        int right = heigth(root.right);

        if (left>right) {
            if (left-right>1) {
                check = false;
            }
        } else {
            if (right-left>1){
                check = false;
            }
        }

        return 1+Math.max(left,right);
    }
}
