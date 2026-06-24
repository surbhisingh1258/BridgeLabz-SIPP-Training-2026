public class Book {
    protected int publicationYear;
    protected String title;

    public Book(int publicationYear, String title) {
        this.publicationYear = publicationYear;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "publicationYear=" + publicationYear +
                ", title='" + title + '\'' +
                '}';
    }

}