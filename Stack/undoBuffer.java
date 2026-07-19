public class undoBuffer {

    private String[] data;
    private int top;

    public undoBuffer(int maxDepth) {
        data = new String[maxDepth];
        top = -1;
    }

    public boolean push(String edit) {
        if (top == data.length - 1) {
            System.out.println("Undo buffer is full. Cannot add more edits.");
            return false;
        }

        data[++top] = edit;
        return true;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Nothing to undo.");
            return null;
        }

        return data[top--];
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Undo buffer is empty.");
            return null;
        }

        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}