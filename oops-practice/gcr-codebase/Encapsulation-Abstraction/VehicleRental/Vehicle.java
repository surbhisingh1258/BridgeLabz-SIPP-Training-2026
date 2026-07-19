abstract class Vehicle {
    private String vehicleNumber;
    private String vehicleType;

    // Getter and Setter for vehicleNumber
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    // Getter and Setter for vehicleType
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Abstract Method
    public abstract double calculateRentalCost(int days);

    // Concrete Method
    public void displayVehicleInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}