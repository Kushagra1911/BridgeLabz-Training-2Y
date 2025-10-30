class Book {
    static String libraryName = "City Library";

    final String isbn;
    String title;
    String author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println(libraryName);
    }

    void display() {
        if (this instanceof Book) {
            System.out.println(title + " " + author + " " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b = new Book("The Alchemist", "Paulo Coelho", "ISBN12345");
        b.display();
        Book.displayLibraryName();
    }
}
