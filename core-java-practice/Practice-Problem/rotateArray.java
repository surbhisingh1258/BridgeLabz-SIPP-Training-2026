import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of K: ");
        int k = sc.nextInt();

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        k = k % size; 

        int[] temp = new int[size];

        for (int i = 0; i < size; i++) {
            temp[(i + k) % size] = arr[i];
        }

        System.out.println("Array after rotation:");
        for (int i = 0; i < size; i++) {
            System.out.print(temp[i] + " ");
        }

        sc.close();
    }
}