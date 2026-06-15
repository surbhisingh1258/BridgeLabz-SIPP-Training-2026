import java.util.Scanner;

public class MathWizard {

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public int fibbonacci(int n) {
        int a = 0;
        int b = 1;

        System.out.print(a + " " + b);

        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
        return c;
    }

    public double fibbonacci(double n) {
        int a = 0;
        int b = 1;

        System.out.print(a + " " + b);

        int c = 0;
        for (int i = 2; i <= (int)n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
        return c;
    }

    public static void main(String[] args) {

        MathWizard mathWizard = new MathWizard();
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int n=sc.nextInt();

        System.out.print("1. isPrime\n2. Factorial\n3. Fibonacci (int)\n4. Fibonacci (double)\n");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                boolean prime = mathWizard.isPrime(n);
                System.out.println(prime);
                break;

            case 2:
                int fact = mathWizard.fact(n);
                System.out.println(fact);
                break;

            case 3:
                int fib = mathWizard.fibbonacci(n);
                System.out.println("Last Fibonacci Number: " + fib);
                break;

            case 4:
                double fibo = mathWizard.fibbonacci(n);
                System.out.println("Last Fibonacci Number: " + fibo);
                break;

            default:
                System.out.println("Exit");
                break;
        }
        sc.close();
    }
}