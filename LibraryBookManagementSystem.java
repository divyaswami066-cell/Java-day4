
import java.util.ArrayList;
import java.util.Collections;

public class LibraryBookManagementSystem {
    public static void main(String[] args) {

        // 1. Store book titles in an ArrayList
        ArrayList<String> books = new ArrayList<>();

        books.add("Java Programming");
        books.add("Python Basics");
        books.add("Data Structures");
        books.add("Machine Learning");
        books.add("Database Management");

        // 2. Add a new book
        books.add("Operating Systems");

        // 3. Remove a damaged or unavailable book
        books.remove("Python Basics");

        // 4. Update an existing book title
        books.set(1, "Advanced Data Structures");

        // 5. Search for a book
        String searchBook = "Machine Learning";

        if (books.contains(searchBook)) {
            System.out.println(searchBook + " is available.");
        } else {
            System.out.println(searchBook + " is not available.");
        }

        // 6. Display all available books
        System.out.println("\nAvailable Books:");

        for (String book : books) {
            System.out.println(book);
        }

        // 7. Display total number of books
        System.out.println("\nTotal Number of Books: " + books.size());

        // 8. Display books in reverse order
        Collections.reverse(books);

        System.out.println("\nBooks in Reverse Order:");

        for (String book : books) {
            System.out.println(book);
        }
    }
}
