public class Author {
    public String AuthorName;
    public String AuthorBio;
    Book book;

    public Author(String name, String bio, Book book) {
        this.AuthorName = name;
        this.AuthorBio = bio;
        this.book = book;
    }
    @Override
    public String toString() {
        return "Author{" +
                "AuthorName='" + AuthorName + '\'' +
                ", AuthorBio='" + AuthorBio + '\'' +
                ", book=" + book +
                '}';
    }

}