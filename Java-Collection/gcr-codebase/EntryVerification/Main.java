import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EventManager manager = new EventManager();

        System.out.print("Enter number of registration attempts: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Email ID: ");
            String email = sc.nextLine();

            manager.registerParticipant(email);
        }

        manager.displayParticipants();
        manager.displayTotalParticipants();

        sc.close();
    }
}