/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return root == null || compare(root.left, root.right);
    }

    private boolean compare(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left == right;
        return left.val == right.val && compare(left.left, right.right) && compare(left.right, right.left);
    }

}
