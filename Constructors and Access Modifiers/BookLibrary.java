class BookLibrary {
    boolean available;

    BookLibrary(String title, String author, double price, boolean available) {
        this.available = available;
    }

    void borrow() {
        if (available) available = false;
    }

    public static void main(String[] args) {
        BookLibrary b = new BookLibrary("1984", "George Orwell", 350, true);
        b.borrow();
        System.out.println(b.available);
    }
}
