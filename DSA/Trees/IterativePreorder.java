import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class IterativePreorder {
    public static List<Integer> iterativePreorder(Node root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            Node current = stack.pop();
            result.add(current.val);

            // Push right child first
            if (current.right != null) {
                stack.push(current.right);
            }

            // Push left child
            if (current.left != null) {
                stack.push(current.left);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> result = iterativePreorder(root);

        System.out.println("Preorder Traversal: " + result);
    }
}