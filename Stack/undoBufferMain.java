import java.util.Scanner;

public class undoBufferMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum undo buffer size: ");
        int size = sc.nextInt();
        sc.nextLine();

        undoBuffer buffer = new undoBuffer(size);

        while (true) {
            System.out.println("\n===== Undo Buffer Menu =====");
            System.out.println("1. Record New Edit");
            System.out.println("2. Undo Last Edit");
            System.out.println("3. View Last Edit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter edit: ");
                    String edit = sc.nextLine();

                    if (buffer.push(edit)) {
                        System.out.println("Edit recorded.");
                    }
                    break;

                case 2:
                    String removed = buffer.pop();
                    if (removed != null) {
                        System.out.println("Undo: " + removed);
                    }
                    break;

                case 3:
                    String latest = buffer.peek();
                    if (latest != null) {
                        System.out.println("Latest Edit: " + latest);
                    }
                    break;

                case 4:
                    System.out.println("Program Ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}