
import java.util.ArrayList;

public class StudentNameManagement {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        // 1. Add 10 student names
        students.add("Rahul");
        students.add("Priya");
        students.add("Amit");
        students.add("Sneha");
        students.add("Kiran");
        students.add("Divya");
        students.add("Arjun");
        students.add("Pooja");
        students.add("Ravi");
        students.add("Anu");

        // 2. Display all student names
        System.out.println("Student Names: " + students);

        // 3. Add a student at a specific position
        students.add(2, "Neha");
        System.out.println("After adding Neha: " + students);

        // 4. Remove a student using their name
        students.remove("Amit");
        System.out.println("After removing Amit: " + students);

        // 5. Update a student name at a particular index
        students.set(0, "Rohit");
        System.out.println("After updating index 0: " + students);

        // 6. Search for a student
        if (students.contains("Priya")) {
            System.out.println("Priya exists in the list.");
        } else {
            System.out.println("Priya does not exist in the list.");
        }

        // 7. Display total number of students
        System.out.println("Total students: " + students.size());
    }
}
