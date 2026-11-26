
import java.util.HashMap;

public class StudentMarksManagement {
    public static void main(String[] args) {

        // 1. Store student names as keys and marks as values
        HashMap<String, Integer> students = new HashMap<>();

        // 2. Add student records
        students.put("Rahul", 85);
        students.put("Priya", 90);
        students.put("Amit", 75);
        students.put("Sneha", 88);
        students.put("Kiran", 80);

        // 3. Update marks for an existing student
        students.put("Amit", 82);

        // 4. Search for a student's marks
        if (students.containsKey("Priya")) {
            System.out.println("Priya's Marks: "
                    + students.get("Priya"));
        } else {
            System.out.println("Student not found.");
        }

        // 5. Remove a student record
        students.remove("Kiran");

        // 6. Display all student names and marks
        System.out.println("\nStudent Records:");

        for (String name : students.keySet()) {
            System.out.println(name + " : " + students.get(name));
        }

        // 7. Calculate average marks
        int total = 0;

        for (int marks : students.values()) {
            total = total + marks;
        }

        double average = (double) total / students.size();

        System.out.println("\nAverage Marks: " + average);
    }
}
