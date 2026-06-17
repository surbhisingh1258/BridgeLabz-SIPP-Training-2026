import java.util.Scanner;

public class Factorial {

    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(calculateFactorial(n));

        sc.close();
    }
}