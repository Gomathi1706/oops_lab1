class Book {
    String title;
    String author;

    void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Programming";
        b1.author = "James Gosling";

        Book b2 = new Book();
        b2.title = "Clean Code"; 
        b2.author = "Robert C. Martin";

        System.out.println("Book 1:");
        b1.displayBook();

        System.out.println("\nBook 2:");
        b2.displayBook();
    }
}
