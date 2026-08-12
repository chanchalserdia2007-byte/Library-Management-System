import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Add Book selected");
                    break;

                case 2:
                    System.out.println("View Books selected");
                    break;

                case 3:
                    System.out.println("Search Book selected");
                    break;

                case 4:
                    System.out.println("Issue Book selected");
                    break;

                case 5:
                    System.out.println("Return Book selected");
                    break;

                case 6:
                    System.out.println("Thank you for using the Library Management System!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
