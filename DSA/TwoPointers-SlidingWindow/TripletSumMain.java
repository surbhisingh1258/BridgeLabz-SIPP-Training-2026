import java.util.ArrayList;
import java.util.Scanner;

public class TripletSumMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of job durations: ");
        int n = sc.nextInt();

        int[] jobs = new int[n];

        System.out.println("Enter job durations:");

        for (int i = 0; i < n; i++) {
            jobs[i] = sc.nextInt();
        }

        System.out.print("Enter target duration: ");
        int target = sc.nextInt();

        TripletSum ts = new TripletSum();

        ArrayList<ArrayList<Integer>> result = ts.findTriplets(jobs, target);

        if (result.isEmpty()) {
            System.out.println("No triplets found.");
        } else {
            System.out.println("Triplets:");
            for (ArrayList<Integer> triplet : result) {
                System.out.println(triplet);
            }
        }

        sc.close();
    }
}