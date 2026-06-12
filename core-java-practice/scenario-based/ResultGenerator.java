import java.util.Scanner;
public class ResultGenerator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sub=5;
        int total=0;
        for(int i=0; i<sub; i++){
            System.out.println("enter subjects marks: ");
            int marks=sc.nextInt();
            total+=marks;
        }
        double average=total/sub;

        int gradeCategory;

        if (average >= 90) {
            gradeCategory = 1;
        } else if (average >= 80) {
            gradeCategory = 2;
        } else if (average >= 70) {
            gradeCategory = 3;
        } else if (average >= 60) {
            gradeCategory = 4;
        } else {
            gradeCategory = 5;
        }

        String grade;
        switch (gradeCategory){
            case 1:
                grade="A+";
                break;
            case 2:
                grade="A";
                break;
            case 3:
                grade="B";
                break;
            case 4:
                grade="C";
                break;
            default:
                grade="F"; 
        }
        System.out.println("\n----- Result -----");
        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
        System.out.println("Grade = " + grade);

        sc.close();
    }

}