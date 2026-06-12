import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int capacity = 5;      
        int occupied = 0;      

        while (occupied < capacity) {

            System.out.println("\n===== Parking Lot Menu =====");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit Program");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (occupied < capacity) {
                        occupied++;
                        System.out.println("Vehicle parked successfully.");
                    } else {
                        System.out.println("Parking lot is full.");
                    }
                    break;

                case 2:
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Vehicle exited successfully.");
                    } else {
                        System.out.println("Parking lot is empty.");
                    }
                    break;

                case 3:
                    System.out.println("Occupied Spaces: " + occupied);
                    System.out.println("Available Spaces: " + (capacity - occupied));
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }

            if (occupied == capacity) {
                System.out.println("\nParking lot is FULL!");
                break;
            }
        }

        System.out.println("System Closed.");
        sc.close();
    }
}