public class RentalSystem {
    public static void main(String[] args) {

        // Car Object
        Car car = new Car();
        car.setVehicleNumber("CAR101");
        car.setVehicleType("Car");
        car.setDailyRate(2000);

        // Bike Object
        Bike bike = new Bike();
        bike.setVehicleNumber("BIKE202");
        bike.setVehicleType("Bike");
        bike.setDailyRate(500);

        // Truck Object
        Truck truck = new Truck();
        truck.setVehicleNumber("TRUCK303");
        truck.setVehicleType("Truck");
        truck.setDailyRate(3000);
        truck.setLoadingCharge(1500);

        int days = 5;

        // Car Details
        System.out.println("Car Details:");
        car.displayVehicleInfo();
        System.out.println("Rental Cost for " + days + " days: " + car.calculateRentalCost(days));

        System.out.println();

        // Bike Details
        System.out.println("Bike Details:");
        bike.displayVehicleInfo();
        System.out.println("Rental Cost for " + days + " days: " + bike.calculateRentalCost(days));

        System.out.println();

        // Truck Details
        System.out.println("Truck Details:");
        truck.displayVehicleInfo();
        System.out.println("Rental Cost for " + days + " days: " + truck.calculateRentalCost(days));
    }
}