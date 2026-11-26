
import java.util.HashMap;
import java.util.Map;

public class PhoneContactDirectory {
    public static void main(String[] args) {

        HashMap<String, String> contacts = new HashMap<>();

        // 1. Store contact names and phone numbers
        contacts.put("Amit", "9876543210");
        contacts.put("Priya", "9876501234");
        contacts.put("Rahul", "9123456780");
        contacts.put("Divya", "9988776655");

        // 2. Add a new contact
        contacts.put("Sneha", "9012345678");

        // 3. Update an existing phone number
        contacts.put("Amit", "9876540000");

        // 4. Search for a contact
        String searchName = "Priya";

        if (contacts.containsKey(searchName)) {
            System.out.println(searchName + "'s phone number: "
                    + contacts.get(searchName));
        } else {
            System.out.println("Contact not found.");
        }

        // 5. Delete a contact
        contacts.remove("Rahul");
        System.out.println("Rahul's contact deleted.");

        // 6. Display all contacts
        System.out.println("\nAll Contacts:");

        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Name: " + entry.getKey()
                    + ", Phone: " + entry.getValue());
        }

        // 7. Check whether a phone number is already saved
        String searchNumber = "9988776655";

        if (contacts.containsValue(searchNumber)) {
            System.out.println("\nPhone number " + searchNumber
                    + " is already saved.");
        } else {
            System.out.println("\nPhone number is not saved.");
        }
    }
}
