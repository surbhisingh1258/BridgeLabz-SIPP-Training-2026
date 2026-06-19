import java.io.*;

public class StudentResultPortal {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("students.txt"));

            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("reportcard.txt", true));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];
                int mark1 = Integer.parseInt(data[1]);
                int mark2 = Integer.parseInt(data[2]);
                int mark3 = Integer.parseInt(data[3]);

                double average = (mark1 + mark2 + mark3) / 3.0;

                bw.write("Student Name : " + name);
                bw.newLine();
                bw.write("Marks        : " + mark1 + ", "
                        + mark2 + ", " + mark3);
                bw.newLine();
                bw.write("Average      : "
                        + String.format("%.2f", average));
                bw.newLine();
                bw.write("--------------------------------");
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Report card generated successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: students.txt file not found.");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid marks format in file.");
        }
    }
}