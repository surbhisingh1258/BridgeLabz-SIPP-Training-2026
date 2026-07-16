class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BSTDelete {

    static Node insert(Node root, int val) {
        if (root == null)
            return new Node(val);

        if (val < root.val)
            root.left = insert(root.left, val);
        else if (val > root.val)
            root.right = insert(root.right, val);

        return root;
    }


    static Node minValue(Node node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    
    static Node delete(Node root, int key) {

        if (root == null)
            return null;

        if (key < root.val) {
            root.left = delete(root.left, key);
        }
        else if (key > root.val) {
            root.right = delete(root.right, key);
        }
        else {

            
            if (root.left == null && root.right == null)
                return null;

            
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            
            Node successor = minValue(root.right);
            root.val = successor.val;
            root.right = delete(root.right, successor.val);
        }

        return root;
    }

    
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        Node root = null;

        root = insert(root, 50);
        insert(root, 30);
        insert(root, 70);
        insert(root, 20);
        insert(root, 40);
        insert(root, 60);
        insert(root, 80);

        System.out.println("Original BST:");
        inorder(root);

        root = delete(root, 70);

        System.out.println("\nAfter Deleting 70:");
        inorder(root);
    }
}