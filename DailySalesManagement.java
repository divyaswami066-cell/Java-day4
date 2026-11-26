
import java.util.LinkedHashMap;
import java.util.Map;

public class DailySalesManagement {
    public static void main(String[] args) {

        // 1. Store product names as keys and sales quantities as values
        LinkedHashMap<String, Integer> sales = new LinkedHashMap<>();

        sales.put("Laptop", 5);
        sales.put("Mouse", 20);
        sales.put("Keyboard", 12);
        sales.put("Monitor", 8);

        // 2. LinkedHashMap maintains insertion order

        // 3. Add new product sales
        sales.put("Printer", 6);

        // 4. Update sales quantity
        sales.put("Mouse", 25);

        // 5. Display all products and their sales
        System.out.println("Daily Sales Report:");

        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            System.out.println("Product: " + entry.getKey()
                    + ", Quantity Sold: " + entry.getValue());
        }

        // 6. Calculate total quantity sold
        int totalSales = 0;

        for (int quantity : sales.values()) {
            totalSales += quantity;
        }

        System.out.println("\nTotal Quantity Sold: " + totalSales);

        // 7. Find product with highest sales quantity
        String highestProduct = "";
        int highestQuantity = 0;

        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            if (entry.getValue() > highestQuantity) {
                highestQuantity = entry.getValue();
                highestProduct = entry.getKey();
            }
        }

        System.out.println("Highest Selling Product: " + highestProduct);
        System.out.println("Highest Sales Quantity: " + highestQuantity);

        // 8. Display report in insertion order
        System.out.println("\nSales Report in Insertion Order:");

        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Example of get()
        System.out.println("\nMouse Sales: " + sales.get("Mouse"));
    }
}
