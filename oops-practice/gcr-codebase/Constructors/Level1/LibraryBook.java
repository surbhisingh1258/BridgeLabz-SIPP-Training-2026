class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book not available");
        }
    }

    void display() {
        System.out.println(title + " " + author + " " + price + " " + available);
    }

    public static void main(String[] args) {
        LibraryBook b = new LibraryBook("Java", "James", 400, true);

        b.display();
        b.borrowBook();
        b.display();
    }
}