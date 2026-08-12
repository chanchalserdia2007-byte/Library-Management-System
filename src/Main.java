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
            System.out.println("3. Exit");
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

                System.out.println("Thank you for using the Library Management System!");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
