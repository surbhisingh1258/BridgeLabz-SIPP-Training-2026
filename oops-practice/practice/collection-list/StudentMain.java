import java.util.*;

public class StudentMain {
    public static void main(String[] args) {

        StudentData s1 = new StudentData(101, "Sneha", 21, "CSE");
        StudentData s2 = new StudentData(102, "Vanshika", 20, "CIVIL");
        StudentData s3 = new StudentData(103, "Nishtha", 22, "IT");
        StudentData s4 = new StudentData(104, "Lavi", 23, "MECH");
        StudentData s5 = new StudentData(105, "Vanshika", 21, "CIVIL");
        StudentData s6 = new StudentData(106, "Nishtha", 28, "BSC");
        StudentData s7 = new StudentData(107, "Lavi", 29, "EC");

        ArrayList<StudentData> list = new ArrayList<StudentData>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        // Collections.sort(list);
        Collections.sort(list, new SortByAge());

        Collections.sort(list, new SortById());

        Collections.sort(list, new SortByName());

        // //print all or select all from the list

        // // for(StudentData s:list){        
        // //     System.out.println(s);
        // // }

        // Scanner sc =new Scanner(System.in);

        // System.out.println("enter name to find");
        // String name=sc.nextLine();

        // //specific data
        // for(StudentData s:list){
        //     if(s.Name.equalsIgnoreCase(name)){
        //         System.out.println(s);
        //     }else{
        //         System.out.println("Student not found");
        //     }
        // }

        // for(StudentData s:list){
        //     if(s.Age>21){
        //         s.Branch="CSE";
        //         System.out.println(s);
        //     }else{
        //         System.out.println("invalid age");
        //     }
        // }

        // int count=0;
        // String name=" ";
        // for(StudentData s:list){
        //     if(s.Name.length()>count){
        //         count=s.Name.length();
        //         name=s.Name;
        //     }
        // }
        // System.out.println(Name);


        TreeSet<StudentData> treelist = new TreeSet<>();
        treelist.add(s1);
        treelist.add(s2);
        treelist.add(s3);
        treelist.add(s4);
        treelist.add(s5);
        treelist.add(s6);
        treelist.add(s7);

        for(StudentData s:list){
            System.out.print(s);
        }

    }
}