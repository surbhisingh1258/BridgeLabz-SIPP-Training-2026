class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class ValidateBST {

    // Insert node into BST (used to create a sample tree)
    static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Function to validate BST
    static boolean isValidBST(Node root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    // Recursive helper function
    static boolean validate(Node node, long min, long max) {

        // Empty tree is a valid BST
        if (node == null) {
            return true;
        }

        // Current node must lie within (min, max)
        if (node.val <= min || node.val >= max) {
            return false;
        }

        // Check left and right subtrees
        return validate(node.left, min, node.val) &&
               validate(node.right, node.val, max);
    }

    // Inorder Traversal
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        Node root = null;

        // Creating a valid BST
        root = insert(root, 50);
        insert(root, 30);
        insert(root, 70);
        insert(root, 20);
        insert(root, 40);
        insert(root, 60);
        insert(root, 80);

        System.out.print("Inorder Traversal: ");
        inorder(root);

        System.out.println();

        if (isValidBST(root)) {
            System.out.println("The tree is a Valid BST.");
        } else {
            System.out.println("The tree is NOT a Valid BST.");
        }
    }
}