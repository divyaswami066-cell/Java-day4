
import java.util.HashMap;
import java.util.Map;

public class EmployeeSalaryManagement {
    public static void main(String[] args) {

        // 1. Store employee IDs as keys and salaries as values
        HashMap<Integer, Double> employees = new HashMap<>();

        // 2. Add employee salary records
        employees.put(101, 25000.0);
        employees.put(102, 30000.0);
        employees.put(103, 28000.0);
        employees.put(104, 35000.0);
        employees.put(105, 32000.0);

        // 3. Update an employee's salary
        employees.replace(103, 31000.0);

        // 4. Search for an employee using their ID
        int searchId = 102;

        if (employees.containsKey(searchId)) {
            System.out.println("Employee ID: " + searchId);
            System.out.println("Salary: " + employees.get(searchId));
        } else {
            System.out.println("Employee not found.");
        }

        // 5. Display all employee IDs and salaries
        System.out.println("\nAll Employee Records:");

        for (Map.Entry<Integer, Double> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey()
                    + ", Salary: " + entry.getValue());
        }

        // 6. Find the employee with the highest salary
        int highestSalaryId = -1;
        double highestSalary = 0;

        for (Map.Entry<Integer, Double> entry : employees.entrySet()) {
            if (entry.getValue() > highestSalary) {
                highestSalary = entry.getValue();
                highestSalaryId = entry.getKey();
            }
        }

        System.out.println("\nEmployee with Highest Salary:");
        System.out.println("Employee ID: " + highestSalaryId);
        System.out.println("Salary: " + highestSalary);

        // 7. Calculate total salary expenditure
        double totalSalary = 0;

        for (double salary : employees.values()) {
            totalSalary += salary;
        }

        System.out.println("Total Salary Expenditure: " + totalSalary);
    }
}
