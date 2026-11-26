
import java.util.TreeMap;
import java.util.Map;

public class SortedStudentDatabase {
    public static void main(String[] args) {

        // 1. Store roll numbers as keys and names as values
        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(105, "Amit");
        students.put(102, "Priya");
        students.put(108, "Rahul");
        students.put(101, "Sneha");
        students.put(106, "Divya");

        // 2. Records are automatically sorted by roll number

        // 3. Add a new student record
        students.put(103, "Kiran");

        // 4. Update a student's name
        students.put(105, "Arjun");

        // 5. Remove a student record
        students.remove(108);

        // 6. Display records in ascending order
        System.out.println("Students in Ascending Order:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Display the first and last roll numbers
        System.out.println("\nFirst Roll Number: " + students.firstKey());
        System.out.println("Last Roll Number: " + students.lastKey());

        // 7. Display records in descending order
        System.out.println("\nStudents in Descending Order:");
        for (Map.Entry<Integer, String> entry :
                students.descendingMap().entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // 8. Display records within a roll number range (102 to 106)
        System.out.println("\nStudents with Roll Numbers 102 to 106:");
        for (Map.Entry<Integer, String> entry :
                students.subMap(102, true, 106, true).entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Search for a student's name using roll number
        System.out.println("\nStudent with Roll Number 103: "
                + students.get(103));
    }
}
