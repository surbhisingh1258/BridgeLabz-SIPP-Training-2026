import java.util.Scanner;

public class SimpleInterest {

    public double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        SimpleInterest obj = new SimpleInterest();

        double si = obj.calculateSI(principal, rate, time);

       
        System.out.println("\nThe Simple Interest is " + si +
                           " for Principal " + principal +
                           ", Rate of Interest " + rate +
                           " and Time " + time);

        sc.close();
    }
}