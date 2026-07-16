import java.util.ArrayDeque;
import java.util.Deque;

public class PrintQueue {

    private Deque<Integer> printQueue = new ArrayDeque<>();

    // Add a normal job
    public void submitJob(int jobId) {
        printQueue.addLast(jobId);
        System.out.println("Normal Job Submitted: " + jobId);
    }

    // Add an urgent job
    public void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId);
        System.out.println("Urgent Job Submitted: " + jobId);
    }

    // Print the next job
    public int printNextJob() {
        if (printQueue.isEmpty()) {
            throw new RuntimeException("No jobs in the queue!");
        }

        return printQueue.removeFirst();
    }

    // Display the queue
    public void displayQueue() {
        System.out.println("Current Queue: " + printQueue);
    }

    public static void main(String[] args) {

        PrintQueue queue = new PrintQueue();

        queue.submitJob(101);
        queue.submitJob(102);
        queue.submitJob(103);

        queue.displayQueue();

        queue.submitUrgentJob(999);

        queue.displayQueue();

        System.out.println("Printing Job: " + queue.printNextJob());

        queue.displayQueue();
    }
}