public class StudentData implements Comparable<StudentData> {
    int Id;
    String Name;
    int Age;
    String Branch;

    public StudentData(int id, String name, int age, String branch) {
        this.Id = id;
        this.Name = name;
        this.Age = age;
        this.Branch = branch;
    }
    @Override
    public String toString(){
        System.out.println("---------------------------------------------------");
        return "ID: " + Id+ "\nName: " +Name+ "\nAge: " +Age+ "\nBranch: " +Branch;
        
    }

    @Override
    public int compareTo(StudentData t){
        return this.Age-t.Age;
    }
}