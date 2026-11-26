
import java.util.LinkedHashSet;

public class RecentlyAddedContacts {
    public static void main(String[] args) {

        // 1. Store contact names
        LinkedHashSet<String> contacts = new LinkedHashSet<>();

        contacts.add("Rahul");
        contacts.add("Priya");
        contacts.add("Amit");
        contacts.add("Sneha");

        // 2 and 3. Maintain insertion order and add new contacts
        contacts.add("Kiran");
        contacts.add("Divya");

        // 4. Prevent duplicate contact names
        contacts.add("Rahul");
        System.out.println("After adding duplicate: " + contacts);

        // 5. Remove a contact
        contacts.remove("Amit");
        System.out.println("After removing Amit: " + contacts);

        // 6. Search for a contact
        if (contacts.contains("Priya")) {
            System.out.println("Priya is in the contacts.");
        } else {
            System.out.println("Priya is not in the contacts.");
        }

        // 7. Display contacts in insertion order
        System.out.println("Contacts in insertion order:");

        for (String name : contacts) {
            System.out.println(name);
        }
    }
}
