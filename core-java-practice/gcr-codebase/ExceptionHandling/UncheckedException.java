import java.util.Scanner;
import java.util.InputMismatchException;

public class UncheckedException {

    static class DivisionByZeroException extends Exception {
        public DivisionByZeroException() {
            super("Division by zero is not allowed.");
        }
    }

    public static void divideNumbers(int num, int den)
            throws DivisionByZeroException {

        if (den == 0) {
            throw new DivisionByZeroException();
        }

        int result = num / den;
        System.out.println("Result = " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();

            System.out.print("Enter denominator: ");
            int den = sc.nextInt();

            divideNumbers(num, den);

        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }

        sc.close();
    }
}