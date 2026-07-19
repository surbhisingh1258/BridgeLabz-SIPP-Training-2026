import java.util.*;
import java.io.*;
import java.io.BufferedReader;

public class studentData {
    int ID;
    String Name;
    int Marks;

    public studentData(int id, String name, int marks) {
        this.ID = id;
        this.Name = name;
        this.Marks = marks;
    }

    @Override
    public String toString() {
        return "StudentData{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Marks=" + Marks +
                '}';
    }

    public static void addStudentData() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your ID:");
            int id = sc.nextInt();

            System.out.println("Enter your Name:");
            String name = sc.next();

            System.out.println("Enter your Marks:");
            int marks = sc.nextInt();

            FileWriter write = new FileWriter("Student.txt",true);
            write.write("ID=" + id + ", Name=" + name + ", Marks=" + marks);
            write.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // public static void readStudent(){
    //     try{
    //         FileReader reader = new FileReader("Student.txt");
    //         int ch;
    //         while((ch==reader.read())!=-1){
    //             System.out.print((char)ch);
    //         }
    //         reader.close();
    //     }
    //     catch(Exception e){
    //         e.printStackTrace();
    //     }
    // }

    public void searchByName(){
        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("enter a name: ");
            String name = sc.nextLine();

            BufferedReader reader = new BufferedReader(new FileReader("Student.txt"));

            String line;

            while((line=reader.readLine())!=null)
            {
                String[] student = line.split(",");

                if(student[1].equalsIgnoreCase("Name: " +name)){
                    System.out.print(student[0]);
                    System.out.print(student[1]);
                    System.out.print(student[2]);

                } else{
                    System.out.println("student not found");
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        studentData data = new studentData(0, " ", 0);
        data.searchByName();
        // System.out.println("Student added successfully!");
    }
}