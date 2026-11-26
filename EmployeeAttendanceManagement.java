
import java.util.ArrayList;

public class EmployeeAttendanceManagement {
    public static void main(String[] args) {

        // 1. Store employees who are present
        ArrayList<String> employees = new ArrayList<>();

        employees.add("Rahul");
        employees.add("Priya");
        employees.add("Amit");
        employees.add("Sneha");
        employees.add("Kiran");

        // 2. Add a newly present employee
        employees.add("Divya");

        // 3. Remove an employee marked absent
        employees.remove("Amit");

        // 4. Display the attendance list
        System.out.println("Attendance List: " + employees);

        // 5. Search for an employee's attendance
        if (employees.contains("Priya")) {
            System.out.println("Priya is present.");
        } else {
            System.out.println("Priya is absent.");
        }

        // 6. Display the total number of present employees
        System.out.println("Total present employees: "
                + employees.size());

        // 7. Display employees in reverse order
        System.out.println("Employees in reverse order:");

        for (int i = employees.size() - 1; i >= 0; i--) {
            System.out.println(employees.get(i));
        }
    }
}
