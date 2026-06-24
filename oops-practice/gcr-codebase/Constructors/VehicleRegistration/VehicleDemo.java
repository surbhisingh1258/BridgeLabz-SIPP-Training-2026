public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Surbhi", "Car");
        Vehicle v2 = new Vehicle("Rahul", "Bike");

        System.out.println("Before Fee Update:");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(7000);

        System.out.println("\nAfter Fee Update:");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}