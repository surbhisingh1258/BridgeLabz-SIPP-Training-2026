class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BSTInsert {

    static Node insert(Node node, int id) {

       
        if (node == null) {
            return new Node(id);
        }

       
        if (id < node.val) {
            node.left = insert(node.left, id);
        }

        
        else if (id > node.val) {
            node.right = insert(node.right, id);
        }

        return node;
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

        System.out.println("BST after insertion:");
        inorder(root);
    }
}