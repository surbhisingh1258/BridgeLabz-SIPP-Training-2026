public class InsertAfterNode {

    // Node class
    static class Node {
        int trackId;
        Node next;

        Node(int trackId) {
            this.trackId = trackId;
            this.next = null;
        }
    }

    // Insert a new node after the current node
    public static void insertAfter(Node current, int trackId) {
        if (current == null) {
            System.out.println("Current node cannot be null.");
            return;
        }

        Node newNode = new Node(trackId);
        
        newNode.next = current.next;

        current.next = newNode;
    }

    // Display the linked list
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.trackId + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(103);

        System.out.println("Original Playlist:");
        display(head);

        insertAfter(head.next, 104);

        System.out.println("Playlist after inserting 104 after 102:");
        display(head);
    }
}