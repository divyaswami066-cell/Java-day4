
import java.util.TreeSet;

public class SortedEmployeeIDManagement {
    public static void main(String[] args) {

        // 1. Store employee IDs
        TreeSet<Integer> employees = new TreeSet<>();

        employees.add(105);
        employees.add(102);
        employees.add(108);
        employees.add(101);
        employees.add(106);
        employees.add(104);
        employees.add(110);

        // 2. Display IDs in ascending order
        System.out.println("Employee IDs: " + employees);

        // 3. Add a new employee ID
        employees.add(103);
        System.out.println("After adding 103: " + employees);

        // 4. Remove an employee ID
        employees.remove(106);
        System.out.println("After removing 106: " + employees);

        // 5. Display smallest and largest IDs
        System.out.println("Smallest ID: " + employees.first());
        System.out.println("Largest ID: " + employees.last());

        // 6. Find next higher and lower IDs
        int id = 104;

        System.out.println("Next higher ID than " + id + ": "
                + employees.higher(id));

        System.out.println("Next lower ID than " + id + ": "
                + employees.lower(id));

        // 7. Display IDs within a specified range
        System.out.println("IDs from 103 to 108: "
                + employees.subSet(103, true, 108, true));

        // Additional range operations
        System.out.println("IDs less than 105: "
                + employees.headSet(105));

        System.out.println("IDs greater than or equal to 105: "
                + employees.tailSet(105));
    }
}
