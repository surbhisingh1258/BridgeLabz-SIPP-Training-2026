import java.util.Scanner;

public class ElectricityBill {
    double units;

    public double electricityBill(double units) {
        double rate = (units <= 50) ? 5 :
                      (units <= 100) ? 10 :
                      (units <= 200) ? 15 :
                      (units <= 300) ? 20 : 30;

        return rate;
    }

    public void generateBill(double units, double amount) {
        System.out.println("---------------------------------------------------------");
        System.out.println("WELCOME TO ELECTRICITY BOARD");
        System.out.println("Total Units Consumed -> " + units);
        System.out.println("Total Amount to be Paid -> " + amount);
        System.out.println("---------------------------------------------------------");
    }

    public static void main(String[] args) {
        ElectricityBill elec = new ElectricityBill();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        elec.units = scanner.nextDouble();

        double rate = elec.electricityBill(elec.units);
        double totalAmount = elec.units * rate;

        elec.generateBill(elec.units, totalAmount);

        scanner.close();
    }
}