
import java.util.LinkedHashMap;
import java.util.Map;

public class OrderProcessingSystem {
    public static void main(String[] args) {

        // 1. Store order IDs as keys and customer names as values
        LinkedHashMap<Integer, String> orders = new LinkedHashMap<>();

        orders.put(101, "Amit");
        orders.put(102, "Priya");
        orders.put(103, "Rahul");
        orders.put(104, "Sneha");

        // 2. LinkedHashMap maintains insertion order

        // 3. Add a new order
        orders.put(105, "Divya");

        // 4. Update customer information for an existing order
        orders.put(102, "Priya Sharma");

        // 5. Cancel an order
        orders.remove(103);
        System.out.println("Order 103 cancelled.");

        // 6. Search for an order using its ID
        int searchId = 102;

        if (orders.containsKey(searchId)) {
            System.out.println("Order ID: " + searchId
                    + ", Customer: " + orders.get(searchId));
        } else {
            System.out.println("Order not found.");
        }

        // 7. Display all orders in insertion order
        System.out.println("\nAll Orders:");

        for (Map.Entry<Integer, String> entry : orders.entrySet()) {
            System.out.println("Order ID: " + entry.getKey()
                    + ", Customer: " + entry.getValue());
        }
    }
}
