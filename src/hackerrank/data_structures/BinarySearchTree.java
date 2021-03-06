package hackerrank.data_structures;

public class BinarySearchTree {

    public boolean checkBST(TreeNode root, int min, int max) {
        if ( root == null) {
            return true;
        }
        if (root.data < min || root.data > max) {
            return false;
        }
        return checkBST(root.left, min, root.data - 1) &&
                checkBST(root.right, root.data + 1, max);
    }

    public boolean checkBst(TreeNode root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
