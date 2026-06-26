public class NotificationSystem {
    public static void main(String[] args) {

        Notification[] notifications = {
            new EmailNotification("Surbhi", "Welcome to our service!"),
            new SMSNotification("Rahul", "Your OTP is 4589"),
            new PushNotification("Aditi", "You have a new message")
        };


        System.out.println("Sending Notifications:\n");
        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}