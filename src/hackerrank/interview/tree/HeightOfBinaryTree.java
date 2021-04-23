package hackerrank.interview.tree;


public class HeightOfBinaryTree {

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

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static int height(Node root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 0;

        return 1 + Math.max(
                height(root.left),
                height(root.right)
        );
    }

}
