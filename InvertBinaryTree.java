/**
 * Invert a binary tree
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (null == root) return null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}
