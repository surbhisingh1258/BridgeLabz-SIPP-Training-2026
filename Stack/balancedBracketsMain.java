import java.util.Scanner;

public class balancedBracketsMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        balancedBrackets checker = new balancedBrackets();

        System.out.print("Enter bracket string: ");
        String input = sc.nextLine();

        if (checker.isValidConfig(input)) {
            System.out.println("Valid Configuration");
        } else {
            System.out.println("Invalid Configuration");
        }

        sc.close();
    }
}