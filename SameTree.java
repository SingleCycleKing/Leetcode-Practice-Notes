/**
 * Given two binary trees, write a function to check if they are equal or not.
 *
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (null == p && null == q) return true;
        else if (null != p && null != q) {
            if (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) return true;
        } else return false;
        return false;
    }
}
