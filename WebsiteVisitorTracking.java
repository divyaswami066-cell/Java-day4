
import java.util.LinkedHashSet;

public class WebsiteVisitorTracking {
    public static void main(String[] args) {

        // 1. Store visitor IDs
        LinkedHashSet<Integer> visitors = new LinkedHashSet<>();

        visitors.add(101);
        visitors.add(102);
        visitors.add(103);
        visitors.add(104);

        // 2 and 4. Maintain arrival order and add new visitors
        visitors.add(105);

        // 3. Prevent duplicate visitor IDs
        visitors.add(102);
        System.out.println("After adding duplicate: " + visitors);

        // 5. Remove a visitor ID if required
        visitors.remove(103);
        System.out.println("After removing visitor 103: " + visitors);

        // 6. Check whether a visitor has already visited
        if (visitors.contains(101)) {
            System.out.println("Visitor 101 has already visited.");
        } else {
            System.out.println("Visitor 101 has not visited.");
        }

        // 7. Display total unique visitors and arrival order
        System.out.println("Total Unique Visitors: " + visitors.size());

        System.out.println("Visitors in Arrival Order:");
        for (int id : visitors) {
            System.out.println(id);
        }
    }
}
