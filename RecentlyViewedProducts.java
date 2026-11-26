
import java.util.LinkedHashSet;

public class RecentlyViewedProducts {
    public static void main(String[] args) {

        // Create LinkedHashSet to store products in insertion order
        LinkedHashSet<String> products = new LinkedHashSet<>();

        // 1. Add recently viewed products
        products.add("Laptop");
        products.add("Mobile");
        products.add("Headphones");
        products.add("Keyboard");
        products.add("Mouse");

        System.out.println("Recently Viewed Products: " + products);

        // 2. Add a newly viewed product
        products.add("Smart Watch");
        System.out.println("\nAfter viewing Smart Watch: " + products);

        // 3. Prevent duplicate product names
        products.add("Laptop");
        System.out.println("After viewing Laptop again: " + products);

        // 4. Display products in insertion order
        System.out.println("\nProducts in Viewing Order: " + products);

        // 5. Search whether a product was viewed
        String searchProduct = "Mobile";

        if (products.contains(searchProduct)) {
            System.out.println(searchProduct + " was viewed.");
        } else {
            System.out.println(searchProduct + " was not viewed.");
        }

        // 6. Remove a product
        products.remove("Keyboard");
        System.out.println("\nAfter removing Keyboard: " + products);

        // 7. Display total unique viewed products
        System.out.println("Total Unique Viewed Products: " + products.size());
    }
}
