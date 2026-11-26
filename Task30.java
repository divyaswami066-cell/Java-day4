
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Map;
import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Store student names and marks
        HashMap<String, Integer> students = new HashMap<>();

        // Store unique marks in ascending order
        TreeSet<Integer> uniqueMarks = new TreeSet<>();

        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        if (n <= 0) {
            System.out.println("Number of students must be positive.");
            sc.close();
            return;
        }

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine().trim();

            System.out.print("Enter marks (0-100): ");
            int marks = Integer.parseInt(sc.nextLine().trim());

            if (name.isEmpty() || marks < 0 || marks > 100) {
                System.out.println("Invalid name or marks. Try again.");
                i--;
                continue;
            }

            if (students.containsKey(name)) {
                System.out.println(
                    "Student name already exists. Enter a different name."
                );
                i--;
                continue;
            }

            students.put(name, marks);
            uniqueMarks.add(marks);
        }

        // Display all students and marks
        System.out.println("\n===== ALL STUDENTS =====");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(
                entry.getKey() + " : " + entry.getValue()
            );
        }

        // Highest and lowest marks
        System.out.println("\nHighest Marks: " + uniqueMarks.last());
        System.out.println("Lowest Marks: " + uniqueMarks.first());

        // Display unique marks in ascending order
        System.out.println("\nUnique Marks in Ascending Order:");
        System.out.println(uniqueMarks);

        // Display students scoring above 80
        System.out.println("\n===== STUDENTS SCORING ABOVE 80 =====");

        boolean foundAbove80 = false;

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() > 80) {
                System.out.println(
                    entry.getKey() + " : " + entry.getValue()
                );
                foundAbove80 = true;
            }
        }

        if (!foundAbove80) {
            System.out.println("No students scored above 80.");
        }

        // Calculate class average and count passes/fails
        int totalMarks = 0;
        int passCount = 0;
        int failCount = 0;

        for (int marks : students.values()) {
            totalMarks += marks;

            if (marks >= 40) {
                passCount++;
            } else {
                failCount++;
            }
        }

        double average = (double) totalMarks / students.size();

        System.out.printf("\nClass Average: %.2f%n", average);

        // Display top-performing student or students
        int highestMarks = uniqueMarks.last();

        System.out.println("\n===== TOP-PERFORMING STUDENT(S) =====");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() == highestMarks) {
                System.out.println(
                    entry.getKey() + " : " + entry.getValue()
                );
            }
        }

        // Display pass and fail counts
        System.out.println("\nStudents Passed: " + passCount);
        System.out.println("Students Failed: " + failCount);

        sc.close();
    }
}
