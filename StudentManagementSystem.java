
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class StudentManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Integer> studentIds = new ArrayList<>();
    static ArrayList<String> studentNames = new ArrayList<>();
    static ArrayList<Integer> studentMarks = new ArrayList<>();

    static LinkedList<String> attendance = new LinkedList<>();

    // Read an integer safely
    static int readInt(String message) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    // Read a non-empty name
    static String readName(String message) {
        while (true) {
            System.out.print(message);
            String name = sc.nextLine().trim();

            if (!name.isEmpty()) {
                return name;
            }

            System.out.println("Name cannot be empty.");
        }
    }

    // Find student using ID
    static int findStudentById(int id) {
        return studentIds.indexOf(id);
    }

    // Find student using name
    static int findStudentByName(String name) {
        return studentNames.indexOf(name);
    }

    // Check marks between 0 and 100
    static int readMarks(String message) {
        while (true) {
            int marks = readInt(message);

            if (marks >= 0 && marks <= 100) {
                return marks;
            }

            System.out.println("Marks must be between 0 and 100.");
        }
    }

    // Display one student
    static void displayStudent(int index) {
        System.out.println("Student ID: " + studentIds.get(index));
        System.out.println("Name: " + studentNames.get(index));
        System.out.println("Marks: " + studentMarks.get(index));
    }

    // Module 1: Add student
    static void addStudent() {
        System.out.println("\n--- ADD STUDENT ---");

        int id = readInt("Enter Student ID: ");

        if (studentIds.contains(id)) {
            System.out.println("Student ID already exists.");
            return;
        }

        String name = readName("Enter Student Name: ");
        int marks = readMarks("Enter Student Marks: ");

        studentIds.add(id);
        studentNames.add(name);
        studentMarks.add(marks);

        System.out.println("Student Added Successfully!");
    }

    // Module 2: Display all students
    static void displayStudents() {
        System.out.println("\n--------- STUDENT RECORDS ---------");

        if (studentNames.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        System.out.printf("%-12s %-20s %s%n",
                "Student ID", "Student Name", "Marks");

        for (int i = 0; i < studentNames.size(); i++) {
            System.out.printf("%-12d %-20s %d%n",
                    studentIds.get(i),
                    studentNames.get(i),
                    studentMarks.get(i));
        }

        System.out.println("Total Students: " + studentNames.size());
    }

    // Module 3: Search student
    static void searchStudent() {
        System.out.println("\n--- SEARCH STUDENT ---");

        int id = readInt("Enter Student ID: ");
        int index = findStudentById(id);

        if (index != -1) {
            System.out.println("\nStudent Found!");
            displayStudent(index);
        } else {
            System.out.println("Student not found.");
        }
    }

    // Module 4: Update student marks
    static void updateStudent() {
        System.out.println("\n--- UPDATE STUDENT MARKS ---");

        int id = readInt("Enter Student ID: ");
        int index = findStudentById(id);

        if (index == -1) {
            System.out.println("Student not found.");
            return;
        }

        int newMarks = readMarks("Enter New Marks: ");

        studentMarks.set(index, newMarks);

        System.out.println("Student Marks Updated Successfully!");
        displayStudent(index);
    }

    // Module 5: Remove student
    static void removeStudent() {
        System.out.println("\n--- REMOVE STUDENT ---");

        int id = readInt("Enter Student ID: ");
        int index = findStudentById(id);

        if (index == -1) {
            System.out.println("Student not found.");
            return;
        }

        String removedName = studentNames.get(index);

        studentIds.remove(index);
        studentNames.remove(index);
        studentMarks.remove(index);

        // Remove the student from attendance also
        attendance.remove(removedName);

        System.out.println("Student Removed Successfully!");
        displayStudents();
    }

    // Module 6: Add attendance
    static void addAttendance() {
        System.out.println("\n--- ADD STUDENT ATTENDANCE ---");

        int id = readInt("Enter Student ID: ");
        int index = findStudentById(id);

        if (index == -1) {
            System.out.println("Student not found.");
            return;
        }

        String name = studentNames.get(index);

        if (attendance.contains(name)) {
            System.out.println("Student is already present.");
            return;
        }

        System.out.println("1. Add at Beginning");
        System.out.println("2. Add at End");

        int choice = readInt("Enter Choice: ");

        if (choice == 1) {
            attendance.addFirst(name);
            System.out.println("Student added at beginning.");
        } else if (choice == 2) {
            attendance.addLast(name);
            System.out.println("Student added at end.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // Display attendance
    static void displayAttendance() {
        System.out.println("\n--- STUDENT ATTENDANCE ---");

        if (attendance.isEmpty()) {
            System.out.println("No students present.");
            return;
        }

        for (int i = 0; i < attendance.size(); i++) {
            System.out.println((i + 1) + ". " + attendance.get(i));
        }

        System.out.println("Total Present Students: " + attendance.size());
    }

    // Remove attendance
    static void removeAttendance() {
        System.out.println("\n--- REMOVE ATTENDANCE ---");

        String name = readName("Enter Student Name: ");

        if (attendance.contains(name)) {
            attendance.remove(name);
            System.out.println("Attendance Removed Successfully!");
        } else {
            System.out.println("Student is not in the attendance list.");
        }
    }

    // Module 7: Statistics
    static void displayStatistics() {
        System.out.println("\n--- STUDENT STATISTICS ---");

        int total = studentMarks.size();

        System.out.println("Total Students: " + total);

        if (studentMarks.isEmpty()) {
            System.out.println("No marks available.");
            return;
        }

        int highest = Collections.max(studentMarks);
        int lowest = Collections.min(studentMarks);

        int sum = 0;
        int above75 = 0;

        for (int i = 0; i < studentMarks.size(); i++) {
            int marks = studentMarks.get(i);
            sum += marks;

            if (marks > 75) {
                above75++;
            }
        }

        double average = (double) sum / total;

        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        System.out.printf("Average Marks: %.2f%n", average);
        System.out.println("Students Above 75: " + above75);
    }

    // Module 7: Sorting and reversing
    static void sortStudentNames() {
        System.out.println("\n--- SORT STUDENT NAMES ---");

        if (studentNames.isEmpty()) {
            System.out.println("No student names available.");
            return;
        }

        ArrayList<String> sortedNames =
                new ArrayList<>(studentNames);

        Collections.sort(sortedNames);

        System.out.println("Names in Alphabetical Order:");
        System.out.println(sortedNames);

        Collections.reverse(sortedNames);

        System.out.println("Names in Reverse Order:");
        System.out.println(sortedNames);
    }

    // Clear all attendance
    static void clearAttendance() {
        attendance.clear();
        System.out.println("Attendance list cleared successfully.");
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n====================================");
            System.out.println("       STUDENT MANAGEMENT SYSTEM");
            System.out.println("====================================");

            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Remove Student");
            System.out.println("6. Add Student Attendance");
            System.out.println("7. Display Attendance");
            System.out.println("8. Remove Attendance");
            System.out.println("9. Display Student Statistics");
            System.out.println("10. Sort Student Names");
            System.out.println("11. Exit");
            System.out.println("12. Clear Attendance");

            int choice = readInt("Enter Your Choice: ");

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    removeStudent();
                    break;

                case 6:
                    addAttendance();
                    break;

                case 7:
                    displayAttendance();
                    break;

                case 8:
                    removeAttendance();
                    break;

                case 9:
                    displayStatistics();
                    break;

                case 10:
                    sortStudentNames();
                    break;

                case 11:
                    System.out.println("Exiting Student Management System.");
                    sc.close();
                    return;

                case 12:
                    clearAttendance();
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
