import java.util.Scanner;

public class callStackMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        callStack stack = new callStack();

        while (true) {
            System.out.println("\n===== Function Call Stack =====");
            System.out.println("1. Call Function");
            System.out.println("2. Return Function");
            System.out.println("3. Current Function");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter function name: ");
                    String function = sc.nextLine();
                    stack.push(function);
                    break;

                case 2:
                    String returned = stack.pop();
                    if (returned != null) {
                        System.out.println(returned + " returned.");
                    }
                    break;

                case 3:
                    String current = stack.peek();
                    if (current != null) {
                        System.out.println("Currently Executing: " + current);
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