public class callStack {

    class Frame {
        String functionName;
        Frame next;

        Frame(String functionName) {
            this.functionName = functionName;
            this.next = null;
        }
    }

    private Frame top;

    public callStack() {
        top = null;
    }

    public void push(String functionName) {
        Frame newFrame = new Frame(functionName);

        newFrame.next = top;
        top = newFrame;

        System.out.println(functionName + " called.");
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("No active call to return from.");
            return null;
        }

        String name = top.functionName;
        top = top.next;

        return name;
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Call stack is empty.");
            return null;
        }

        return top.functionName;
    }

    public boolean isEmpty() {
        return top == null;
    }
}