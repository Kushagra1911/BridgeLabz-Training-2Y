class Book2 {
    public String ISBN;
    protected String title;
    private String author;

    Book2(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    private static final String ISBN = null;

    EBook(String ISBN, String title, String author) {
        super();
    }

    void show() {
        System.out.println(ISBN + " " + title);
    }
}
