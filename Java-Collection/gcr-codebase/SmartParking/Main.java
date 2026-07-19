import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParkingLot parkingLot = new ParkingLot();

        while (true) {

            System.out.println("\n===== Smart Parking Slot Manager =====");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display Vehicles");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Registration Number: ");
                    parkingLot.addVehicle(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter Registration Number: ");
                    parkingLot.removeVehicle(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter Registration Number: ");
                    parkingLot.searchVehicle(sc.nextLine());
                    break;

                case 4:
                    parkingLot.displayVehicles();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}