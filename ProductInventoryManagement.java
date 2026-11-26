
import java.util.HashMap;
import java.util.Map;

public class ProductInventoryManagement {
    public static void main(String[] args) {

        HashMap<Integer, Integer> inventory = new HashMap<>();

        // 1. Store product IDs and quantities
        inventory.put(101, 10);
        inventory.put(102, 3);
        inventory.put(103, 7);
        inventory.put(104, 2);
        inventory.put(105, 5);

        // 2. Add a new product
        inventory.put(106, 8);

        // 3. Update product quantity
        inventory.put(103, 12);

        // 4. Reduce quantity when products are sold
        int productId = 101;
        int soldQuantity = 4;

        if (inventory.containsKey(productId)) {
            int quantity = inventory.get(productId);

            if (quantity >= soldQuantity) {
                inventory.put(productId, quantity - soldQuantity);
                System.out.println("Product sold successfully.");
            } else {
                System.out.println("Insufficient stock.");
            }
        }

        // 5. Search for a product using its ID
        int searchId = 102;

        if (inventory.containsKey(searchId)) {
            System.out.println("Product " + searchId +
                    " quantity: " + inventory.get(searchId));
        } else {
            System.out.println("Product not found.");
        }

        // 6. Display products with quantity below 5
        System.out.println("\nProducts with quantity below 5:");

        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() < 5) {
                System.out.println("Product ID: " + entry.getKey()
                        + ", Quantity: " + entry.getValue());
            }
        }

        // 7. Remove products that are out of stock
        inventory.put(107, 0);

        inventory.entrySet().removeIf(entry -> entry.getValue() == 0);

        System.out.println("\nFinal Product Inventory:");

        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey()
                    + ", Quantity: " + entry.getValue());
        }

        // getOrDefault() example
        System.out.println("\nProduct 108 quantity: "
                + inventory.getOrDefault(108, 0));
    }
}
