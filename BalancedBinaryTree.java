import javax.swing.tree.TreeNode;

/**
 * Given a binary tree, determine if it is height-balanced.
 * <p>
 * For this problem, a height-balanced binary tree is defined
 * as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root, 0) != -1;
    }

    public int checkHeight(TreeNode root, int h) {
        if (root == null) return h;

        int left = checkHeight(root.left, h + 1);
        if (left == -1) return left;

        int right = checkHeight(root.right, h + 1);
        if (right == -1) return right;

        if (Math.abs(left - right) > 1) {
            return -1;
        } else {
            return Math.max(left, right);
        }
    }
}
