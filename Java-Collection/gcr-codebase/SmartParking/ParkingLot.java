import java.util.ArrayList;

public class ParkingLot {

    private ArrayList<String> parkedVehicles;

    public ParkingLot() {
        parkedVehicles = new ArrayList<>();
    }

    public void addVehicle(String regNo) {
        if (parkedVehicles.contains(regNo)) {
            System.out.println("Vehicle is already parked.");
        } else {
            parkedVehicles.add(regNo);
            System.out.println("Vehicle added successfully.");
        }
    }

    public void removeVehicle(String regNo) {
        if (parkedVehicles.remove(regNo)) {
            System.out.println("Vehicle removed successfully.");
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    public void searchVehicle(String regNo) {
        if (parkedVehicles.contains(regNo)) {
            System.out.println("Vehicle is parked.");
        } else {
            System.out.println("Vehicle is not parked.");
        }
    }

    public void displayVehicles() {

        if (parkedVehicles.isEmpty()) {
            System.out.println("Parking lot is empty.");
            return;
        }

        System.out.println("\nParked Vehicles:");
        for (String vehicle : parkedVehicles) {
            System.out.println(vehicle);
        }

        System.out.println("Occupied Slots: " + parkedVehicles.size());
    }
}