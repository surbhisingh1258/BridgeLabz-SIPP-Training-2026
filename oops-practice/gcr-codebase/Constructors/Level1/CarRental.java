class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental() {
        customerName = "Unknown";
        carModel = "Basic";
        rentalDays = 1;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateCost() {
        double ratePerDay = 2000;
        return rentalDays * ratePerDay;
    }

    void display() {
        System.out.println(customerName);
        System.out.println(carModel);
        System.out.println("Total Cost: " + calculateCost());
    }

    public static void main(String[] args) {
        CarRental c = new CarRental("Surbhi", "Swift", 5);
        c.display();
    }
}