public class Student extends Person {

    protected int studentId;
    protected double studentGpa;

    public Student(int id, String Name, int studentId, double studentGpa) {
        super(id, Name);
        this.studentId = studentId;
        this.studentGpa = studentGpa;
    }
}