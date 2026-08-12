public class Book {

    int bookId;
    String title;
    String author;
    boolean available;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);

        if (available) {
            System.out.println("Status: Available");
        } else {
            System.out.println("Status: Issued");
        }
    }

    public void issueBook() {
        if (available) {
            available = false;
            System.out.println("Book issued successfully! ✅");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book returned successfully! ✅");
        } else {
            System.out.println("This book was not issued.");
        }
    }
}
