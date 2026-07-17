import java.util.Scanner;

public class PairSumMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        int[] transactions = new int[n];

        System.out.println("Enter transactions in sorted order:");
        for (int i = 0; i < n; i++) {
            transactions[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        PairSum pairSum = new PairSum();
        int[] result = pairSum.findPairSum(transactions, target);

        if (result[0] == -1) {
            System.out.println("No pair found.");
        } else {
            System.out.println("Pair Found: " + result[0] + " " + result[1]);
        }

        sc.close();
    }
}