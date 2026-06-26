public class Main {
    public static void main(String[] args) {
        double distance = 100;

        Vehicle[] fleet = {
            new Bike("BIKE101"),
            new Car("CAR304"),
            new Bus("BUS201")
        };

        for (Vehicle v : fleet) {
            System.out.println("Vehicle number is: " + v.VehicleNumber);
            System.out.println("Cost for " + distance + " km is: " + v.fuelCost(distance));

            if (v instanceof Car) {
                System.out.println("This is a Car");
            } else if (v instanceof Bike) {
                System.out.println("This is a Bike");
            } else if (v instanceof Bus) {
                System.out.println("This is a Bus");
            } else {
                System.out.println("Invalid Vehicle Type");
            }

            System.out.println();
        }
    }
}