import java.util.*;

public class MaxSubarrayMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of CPU readings: ");
        int n = sc.nextInt();

        int[] cpuLoad = new int[n];

        System.out.println("Enter CPU readings:");

        for (int i = 0; i < n; i++) {
            cpuLoad[i] = sc.nextInt();
        }

        System.out.print("Enter window size (k): ");
        int k = sc.nextInt();

        if (k > n || k <= 0) {
            System.out.println("Invalid window size.");
        } else {
            MaxSubarray ms = new MaxSubarray();

            int maxSum = ms.maxSubarrayOfSizeK(cpuLoad, k);

            System.out.println("Maximum CPU load in any window of size " + k + " = " + maxSum);
        }

        sc.close();
    }
}