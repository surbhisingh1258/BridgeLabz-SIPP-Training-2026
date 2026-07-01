import java.util.Comparator;

public class SortById implements Comparator<StudentData>{
    public int compare(StudentData s1, StudentData s2){
        return s1.Id-s2.Id;
    }

}