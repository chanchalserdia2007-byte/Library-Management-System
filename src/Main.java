import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Book Title: ");
                String title = sc.nextLine();

                System.out.print("Enter Author Name: ");
                String author = sc.nextLine();

                Book book = new Book(id, title, author);
                books.add(book);

                System.out.println("Book added successfully! ✅");

            } else if (choice == 2) {

                if (books.isEmpty()) {
                    System.out.println("No books available.");
                } else {
                    System.out.println("\n----- BOOK LIST -----");

                    for (Book book : books) {
                        book.displayBook();
                        System.out.println("---------------------");
                    }
                }

            } else if (choice == 3) {

                System.out.println("Enter Book ID to search: ");
                int searchId = sc.nextInt();

                boolean found = false;

                for (Book book : books) {
                    if (book.bookId == searchId) {
                        book.displayBook():
                            found = true;
                            break;
                    }
                }
                if(!found) {
                    SYstem.out.println("Book not found.");
                }
           } else if (choice == 4) {

    System.out.print("Enter Book ID to issue: ");
    int issueId = sc.nextInt();

    boolean found = false;

    for (Book book : books) {
        if (book.bookId == issueId) {
            book.issueBook();
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Book not found.");
    }

} else if (choice == 5) {

    System.out.print("Enter Book ID to return: ");
    int returnId = sc.nextInt();

    boolean found = false;

    for (Book book : books) {
        if (book.bookId == returnId) {
            book.returnBook();
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Book not found.");
    }

} else if (choice == 6) {

    System.out.println("Thank you for using the Library Management System!");
    break;
                
        sc.close();
    }
}
