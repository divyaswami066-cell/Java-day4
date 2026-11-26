
import java.util.HashSet;

public class CollegeEventRegistrationSystem {
    public static void main(String[] args) {

        // 1. Store registration IDs for two events
        HashSet<Integer> event1 = new HashSet<>();
        HashSet<Integer> event2 = new HashSet<>();

        // 2. Register students for Event 1
        event1.add(101);
        event1.add(102);
        event1.add(103);
        event1.add(104);

        // 3. Prevent duplicate registrations
        event1.add(102);
        System.out.println("Event 1 Registrations: " + event1);

        // Register students for Event 2
        event2.add(102);
        event2.add(103);
        event2.add(105);
        event2.add(106);

        System.out.println("Event 2 Registrations: " + event2);

        // 4. Cancel a registration from Event 1
        event1.remove(104);
        System.out.println("\nStudent 104 cancelled Event 1 registration.");

        // 5. Search whether a student is registered
        int searchId = 102;

        if (event1.contains(searchId)) {
            System.out.println("Student " + searchId
                    + " is registered for Event 1.");
        } else {
            System.out.println("Student " + searchId
                    + " is not registered for Event 1.");
        }

        // 6. Display all registered students for Event 1
        System.out.println("\nEvent 1 Registered Students: " + event1);

        // 7. Display total unique registrations for Event 1
        System.out.println("Total Event 1 Registrations: " + event1.size());

        // Use addAll() to combine registrations from both events
        HashSet<Integer> allStudents = new HashSet<>(event1);
        allStudents.addAll(event2);

        System.out.println("\nAll Unique Registered Students: " + allStudents);
        System.out.println("Total Unique Students: " + allStudents.size());

        // 8. Find students registered for both events using retainAll()
        HashSet<Integer> commonStudents = new HashSet<>(event1);
        commonStudents.retainAll(event2);

        System.out.println("\nStudents Registered for Both Events: "
                + commonStudents);
        System.out.println("Total Students in Both Events: "
                + commonStudents.size());
    }
}
