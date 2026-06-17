import java.util.Scanner;

public class printNumbers {
    public static void numbers(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        numbers(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        numbers(n);

        sc.close();
    }
}