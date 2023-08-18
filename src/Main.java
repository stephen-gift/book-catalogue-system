import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookCataloging bookCataloging = new BookCataloging();

        while (true){
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a book");
            System.out.println("2. Display books");
            System.out.println("3. Delete a book");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1 : {
                    System.out.println("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter book author: ");
                    String author = scanner.nextLine();
                    bookCataloging.addBook(new Book(title, author));
                    System.out.println("Book added");
                    break;
                }
                case 2 : {
                    bookCataloging.displayBooks();
                    break;
                }
                case 3 : {
                    System.out.print("Enter book title to delete: ");
                    String deleteTitle = scanner.nextLine();
                    bookCataloging.deleteBooks(deleteTitle);
                    break;
                }
                case 4 : {
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                    break;
                }
                default : {
                    System.out.println("Invalid choice. Please choose again.");
                }
            }

        }
    }
}