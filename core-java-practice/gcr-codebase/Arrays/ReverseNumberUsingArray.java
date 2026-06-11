import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        temp = number;
        int index = count - 1;

        
        while (temp != 0) {
            digits[index] = temp % 10;
            temp /= 10;
            index--;
        }

        
        int[] reverseDigits = new int[count];

        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        
        System.out.print("Reversed digits: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseDigits[i] + " ");
        }

        sc.close();
    }
}