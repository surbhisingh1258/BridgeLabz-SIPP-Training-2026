import java.util.Scanner;

public class BMIReport {

    public static String[] calculateBMI(double weight, double heightCm) {

        double heightM = heightCm / 100.0;

        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{
                String.format("%.2f", bmi),
                status
        };
    }

    public static String[][] generateBMIReport(double[][] data) {

        String[][] report = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiData = calculateBMI(weight, height);

            report[i][0] = String.valueOf(height);
            report[i][1] = String.valueOf(weight);
            report[i][2] = bmiData[0];
            report[i][3] = bmiData[1];
        }

        return report;
    }

    // Method to display report
    public static void displayReport(String[][] report) {

        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.printf("%-10s %-12s %-10s %-15s%n",
                "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < report.length; i++) {

            System.out.printf("%-10s %-12s %-10s %-15s%n",
                    report[i][0],
                    report[i][1],
                    report[i][2],
                    report[i][3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][2];

        System.out.println("Enter Weight (kg) and Height (cm) for 10 persons:");

        for (int i = 0; i < 10; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        String[][] bmiReport = generateBMIReport(persons);

        displayReport(bmiReport);

        sc.close();
    }
}