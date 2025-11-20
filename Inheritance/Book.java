class Book {
    String title;
    int publicationYear;
    void displayInfo() {
        System.out.println(title + " (" + publicationYear + ")");
    }
}

class Author extends Book {
    String name, bio;
    void displayInfo() {
        System.out.println(title + " by " + name);
    }
}
