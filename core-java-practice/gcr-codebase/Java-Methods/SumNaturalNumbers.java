import java.util.Scanner;

public class SumNaturalNumbers {
    public int findSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        SumNaturalNumbers obj = new SumNaturalNumbers();

        int sum = obj.findSum(n);

        System.out.println("Sum of first " + n + " natural numbers = " + sum);

        sc.close();
    }
}