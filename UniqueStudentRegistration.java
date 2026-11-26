
import java.util.HashSet;

public class UniqueStudentRegistration {
    public static void main(String[] args) {

        // 1. Store student registration IDs
        HashSet<Integer> students = new HashSet<>();

        students.add(101);
        students.add(102);
        students.add(103);
        students.add(104);
        students.add(105);

        // 2. Prevent duplicate registration IDs
        students.add(101);
        System.out.println("After adding duplicate ID: " + students);

        // 3. Add a new student ID
        students.add(106);

        // 4. Remove a student ID
        students.remove(103);

        // 5. Search whether an ID exists
        if (students.contains(102)) {
            System.out.println("Student ID 102 is registered.");
        } else {
            System.out.println("Student ID 102 is not registered.");
        }

        // 6. Display all registered student IDs
        System.out.println("Registered Student IDs: " + students);

        // 7. Display total unique registrations
        System.out.println("Total Unique Registrations: " + students.size());
    }
}
