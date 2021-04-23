package hackerrank.interview.tree;

public class LowestCommonAncestor {

    private static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node lca(Node root, int v1, int v2) {
        if (root == null || root.data == v1 || root.data == v2)
            return root;

        Node left = lca(root.left, v1, v2);
        Node right = lca(root.right, v1, v2);

        if (left != null && right != null)
            return root;
        else
            return left != null ? left : right;
    }

}
