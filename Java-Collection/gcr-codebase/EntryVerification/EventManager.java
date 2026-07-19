import java.util.HashSet;

public class EventManager {

    private HashSet<String> participants;

    public EventManager() {
        participants = new HashSet<>();
    }

    public void registerParticipant(String email) {
        if (participants.add(email)) {
            System.out.println("Registration Successful!");
        } else {
            System.out.println("Duplicate Registration! Entry Rejected.");
        }
    }

    public void displayParticipants() {
        System.out.println("\nRegistered Participants:");
        for (String email : participants) {
            System.out.println(email);
        }
    }

    public void displayTotalParticipants() {
        System.out.println("\nTotal Eligible Attendees: " + participants.size());
    }
}