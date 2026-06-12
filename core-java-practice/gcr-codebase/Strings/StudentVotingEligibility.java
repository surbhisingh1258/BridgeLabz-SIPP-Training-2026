import java.util.Random;

public class StudentVotingEligibility {

    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10; // 10 to 99
        }

        return ages;
    }

    
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    
    public static void displayTable(String[][] data) {

        System.out.println("--------------------------------");
        System.out.println("Age\tCan Vote");
        System.out.println("--------------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        int numberOfStudents = 10;

        int[] ages = generateAges(numberOfStudents);

        String[][] votingData = checkVotingEligibility(ages);

        displayTable(votingData);
    }
}