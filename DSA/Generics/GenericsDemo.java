import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args) {

        //Without Generics

        System.out.println("Without Generics:");

        List list = new ArrayList();   

        list.add("Java");
        list.add(100);

        try {
            String str = (String) list.get(1); // Runtime Error
            System.out.println(str);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException occurred!");
            System.out.println(e);
        }

        // With Generics

        System.out.println("\nWith Generics:");

        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");

        // Uncomment the next line to see compile-time error
        // languages.add(100);

        for (String language : languages) {
            System.out.println(language);
        }
    }
}