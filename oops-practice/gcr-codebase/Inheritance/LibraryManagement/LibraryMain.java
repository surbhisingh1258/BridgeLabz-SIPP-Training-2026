public class LibraryMain{

    public static void display(){
        Book b = new Book("Dopamine","2004");
        Author a = new Author("Pankaj Sharma","Male",b);

        book b2 = new Book("Narration of idiots","2008");
        Author a2 = new Author("Lakash Tyagi","Male",b);

        System.out.println(a.toString());
        System.out.println(a2.toString());
    }


    public static void main(String[] args){
        display();
    }
}