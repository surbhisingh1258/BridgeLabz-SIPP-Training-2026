import java.util.Comparator;

public class SortByName implements Comparator<StudentData>{
    @Override
    public int compare(StudentData s1, StudentData s2){
        return s1.Name.compareTo(s2.Name);
    }
}