import java.util.Scanner;

public class AthleteRun {
    public double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = sc.nextDouble();

        AthleteRun obj = new AthleteRun();

        double rounds = obj.calculateRounds(side1, side2, side3);

        System.out.println("Number of rounds required to complete 5 km run = " + rounds);

        sc.close();
    }
}