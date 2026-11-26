
import java.util.HashSet;

public class UniqueProductInventory {
    public static void main(String[] args) {

        // 1. Store unique product names
        HashSet<String> products = new HashSet<>();

        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Monitor");
        products.add("Headphones");

        // 2. Add a new product
        products.add("Printer");

        // 3. Attempt to add duplicate products
        products.add("Laptop");
        products.add("Mouse");

        System.out.println("After adding duplicates: " + products);

        // 4. Remove discontinued products
        products.remove("Keyboard");

        // 5. Search for a product
        if (products.contains("Monitor")) {
            System.out.println("Monitor is available.");
        } else {
            System.out.println("Monitor is not available.");
        }

        // 6. Display all unique products
        System.out.println("Unique Products: " + products);

        // 7. Display total number of unique products
        System.out.println("Total Unique Products: " + products.size());
    }
}
