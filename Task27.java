
import java.util.Scanner;
import java.util.TreeMap;

public class Task27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Employee ID is the key and department is the value
        TreeMap<Integer, String> employees = new TreeMap<>();

        int choice;

        do {
            System.out.println("\n===== EMPLOYEE DEPARTMENT MANAGEMENT =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Department");
            System.out.println("3. Search Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. Display Employees (Ascending)");
            System.out.println("6. Display Employees (Descending)");
            System.out.println("7. Display Employees Within ID Range");
            System.out.println("8. Display First and Last Employee IDs");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(sc.nextLine().trim());

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = Integer.parseInt(sc.nextLine().trim());

                    System.out.print("Enter Department Name: ");
                    String department = sc.nextLine().trim();

                    if (employees.containsKey(id)) {
                        System.out.println("Employee ID already exists.");
                    } else if (department.isEmpty()) {
                        System.out.println("Department cannot be empty.");
                    } else {
                        employees.put(id, department);
                        System.out.println("Employee added successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Employee ID: ");
                    int updateId = Integer.parseInt(sc.nextLine().trim());

                    if (employees.containsKey(updateId)) {
                        System.out.print("Enter New Department: ");
                        String newDepartment = sc.nextLine().trim();

                        if (newDepartment.isEmpty()) {
                            System.out.println("Department cannot be empty.");
                        } else {
                            employees.put(updateId, newDepartment);
                            System.out.println("Department updated successfully.");
                        }
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = Integer.parseInt(sc.nextLine().trim());

                    String foundDepartment = employees.get(searchId);

                    if (foundDepartment != null) {
                        System.out.println("Employee ID: " + searchId);
                        System.out.println("Department: " + foundDepartment);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to remove: ");
                    int removeId = Integer.parseInt(sc.nextLine().trim());

                    if (employees.containsKey(removeId)) {
                        employees.remove(removeId);
                        System.out.println("Employee removed successfully.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    if (employees.isEmpty()) {
                        System.out.println("No employee records available.");
                    } else {
                        System.out.println("Employees in Ascending Order:");
                        System.out.println(employees);
                    }
                    break;

                case 6:
                    if (employees.isEmpty()) {
                        System.out.println("No employee records available.");
                    } else {
                        System.out.println("Employees in Descending Order:");
                        System.out.println(employees.descendingMap());
                    }
                    break;

                case 7:
                    if (employees.isEmpty()) {
                        System.out.println("No employee records available.");
                        break;
                    }

                    System.out.print("Enter Starting Employee ID: ");
                    int startId = Integer.parseInt(sc.nextLine().trim());

                    System.out.print("Enter Ending Employee ID: ");
                    int endId = Integer.parseInt(sc.nextLine().trim());

                    if (startId > endId) {
                        System.out.println("Starting ID must not exceed ending ID.");
                    } else {
                        System.out.println("Employees in the given range:");

                        // Include both boundary IDs when present
                        System.out.println(
                            employees.subMap(startId, true, endId, true)
                        );
                    }
                    break;

                case 8:
                    if (employees.isEmpty()) {
                        System.out.println("No employee records available.");
                    } else {
                        System.out.println("First Employee ID: "
                                           + employees.firstKey());
                        System.out.println("Last Employee ID: "
                                           + employees.lastKey());
                    }
                    break;

                case 9:
                    System.out.println("Exiting Employee Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Select 1 to 9.");
            }

        } while (choice != 9);

        sc.close();
    }
}
