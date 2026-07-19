import java.util.ArrayList;
import java.util.Arrays;

public class TripletSum {

    public ArrayList<ArrayList<Integer>> findTriplets(int[] jobs, int target) {

        Arrays.sort(jobs);

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < jobs.length - 2; i++) {

            if (i > 0 && jobs[i] == jobs[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = jobs.length - 1;

            while (left < right) {

                int sum = jobs[i] + jobs[left] + jobs[right];

                if (sum == target) {

                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(jobs[i]);
                    triplet.add(jobs[left]);
                    triplet.add(jobs[right]);

                    result.add(triplet);

                    while (left < right && jobs[left] == jobs[left + 1]) {
                        left++;
                    }

                    while (left < right && jobs[right] == jobs[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }

                else if (sum < target) {
                    left++;
                }

                else {
                    right--;
                }
            }
        }

        return result;
    }
}