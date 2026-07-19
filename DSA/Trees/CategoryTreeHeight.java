class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class CategoryTreeHeight {

    public static int height(Node node) {
        if (node == null) {
            return -1;
        }

        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public static boolean isTooDeep(Node root, int threshold) {
        return height(root) > threshold;
    }

    public static void main(String[] args) {


        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.left.left.left = new Node(6);

        int threshold = 2;

        int treeHeight = height(root);

        System.out.println("Tree Height: " + treeHeight);
        System.out.println("Exceeds Threshold? " + isTooDeep(root, threshold));
    }
}