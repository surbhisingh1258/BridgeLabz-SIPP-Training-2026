public class LibraryMain{

    public static void display(){
        Book b = new Book(2004,"Dopamine");
        Author a = new Author("Pankaj Sharma","Male",b);

        Book b2 = new Book(2008, "Narration of idiots");
        Author a2 = new Author("Lakash Tyagi","Male",b);

        System.out.println(a.toString());
        System.out.println(a2.toString());
    }


    public static void main(String[] args){
        display();
    }
}