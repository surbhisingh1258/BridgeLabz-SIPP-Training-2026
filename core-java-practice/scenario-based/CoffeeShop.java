import java.util.*;

public class CoffeeShop {
    String CoffeeType;
    int quantity;

    public double calculatePrice(String CoffeeType, double price) {
        double bill = price*quantity;
        double gst = price*0.18;
        double finalBill = bill+gst;
        return finalBill;
    }

    public void generateBIll(double bill) {

        System.out.println("------------------------------------------------");
        System.out.println("COFFEE TYPE: " +CoffeeType);
        System.out.println("QUANTITY: " +quantity);
        System.out.println("BILL AMOUNT: " +bill);
        System.out.println("THANK YOU FOR VISITING!");
        System.out.println("------------------------------------------------");
    }
    public static void main(String[] args) {
        System.out.println("Choose the Coffee Type or Exit!");
        System.out.println("1.Cappacino:- 150 \n2.Latte:- 200 \n3.Espresso:- 350 \n4. Americano:- 320 \n5. Black Coffee:- 200");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        CoffeeShop coffee = new CoffeeShop();
        System.out.println("Enter the quantity: ");
        coffee.quantity = sc.nextInt();

        switch (choice) {
            case 1:
                coffee.CoffeeType = "Cappacino";
                coffee.generateBIll(coffee.calculatePrice(coffee.CoffeeType, 150));
               break;

            case 2:
                coffee.CoffeeType = "Latte";
                coffee.generateBIll(coffee.calculatePrice(coffee.CoffeeType,200));
                break;

            case 3:
                coffee.CoffeeType = "Espresso";
                coffee.generateBIll(coffee.calculatePrice(coffee.CoffeeType,350));
                break;

            case 4:
                coffee.CoffeeType = "Americano";
                coffee.generateBIll(coffee.calculatePrice(coffee.CoffeeType,320));
                break;

            case 5:
                coffee.CoffeeType = "Black Coffee";
                coffee.generateBIll(coffee.calculatePrice(coffee.CoffeeType, 200));
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}